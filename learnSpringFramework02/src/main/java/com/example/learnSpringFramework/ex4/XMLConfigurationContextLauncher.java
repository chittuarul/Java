package com.example.learnSpringFramework.ex4;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.example.learnSpringFramework.game.GameRunner;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;





public class XMLConfigurationContextLauncher
{

	public static void main(String[] args) {
		try(var context= new ClassPathXmlApplicationContext(
				"contextConfiguration.xml"))
		{
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("name")); 
			System.out.println(context.getBean("age")); 
			context.getBean(GameRunner.class).run();
		}
		
		}

}
