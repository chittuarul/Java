package com.example.learnSpringFramework.ex5;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class RealWorldSpringLauncher
{

	public static void main(String[] args) {
		try(var context= new AnnotationConfigApplicationContext(
				"RealWorldSpringLauncher.class"))
		{
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}
		
		}

}
