package com.example.learnSpringFramework.ex3;

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
import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named 
class BusinessService
{
	private DataService dataService;
	//@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("setter inject");
		this.dataService = dataService;
	}
	//@Autowired
	public DataService getDataService() {
		System.out.println("getter inject");
		return dataService;
	}
	
	
}
@Component
class DataService
{
	
}



@Configuration
@ComponentScan
public class CDIinjectContextLauncher
{

	public static void main(String[] args) {
		try(var context= new AnnotationConfigApplicationContext(
				CDIinjectContextLauncher.class))
		{
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			 System.out.println(context.getBean(BusinessService.class).getDataService());	
			
			
		}
		
		}

}
