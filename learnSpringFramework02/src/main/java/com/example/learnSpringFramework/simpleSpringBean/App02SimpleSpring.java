package com.example.learnSpringFramework.simpleSpringBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02SimpleSpring {

	public static void main(String[] args) {
		//1. launch a spring context
		try( 
		var context =
				new AnnotationConfigApplicationContext
				(App02SimpleConfiguration.class)
		   )
		{
		//2.configure the things that u want to manage spring
		//App02SimpleCOnfiguration - @COnfiguration

		//3.Retrieving bean managed by spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean(Person.class));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person2methodcall"));
		System.out.println(context.getBean("person2parameters"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("personqualifiers"));
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}
