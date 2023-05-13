package com.example.learnSpringFramework.ex2;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass
{
	SomeDepedency someDepedency;
	private SomeClass(SomeDepedency someDepedency)
	{
		super();
		this.someDepedency=someDepedency;
		System.out.println("all dependency loaded");
	}
	@PostConstruct
	public void initilize() {
		someDepedency.ready();
	}
	@PreDestroy
	public void clean() {
		System.out.println("cleanup");
	}
}


@Component
class SomeDepedency
{
	public void ready() {
		System.out.println("get ready inited");
	}
}

@Configuration
@ComponentScan
public class PrePostContextLauncher
{

	public static void main(String[] args) {
		try(var context= new AnnotationConfigApplicationContext(
				PrePostContextLauncher.class))
		{
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			 	
			
			
		}
		
		}

}
