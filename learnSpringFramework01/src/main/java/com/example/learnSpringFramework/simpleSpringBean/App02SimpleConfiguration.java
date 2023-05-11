package com.example.learnSpringFramework.simpleSpringBean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name,int age,Address address) {}
record Address (String firstline,String city) {}
@Configuration
public class App02SimpleConfiguration {

	@Bean
	public String name()
	{
		return "chittu";
	}
	@Bean
	public int age()
	{
		return 26;
	}
	@Bean
	@Primary
	public Person person() {
		return new Person("chittu", 26,new Address("Shadow st","Gyor"));
	}
	@Bean
	public Person person2methodcall() {
		return new Person(name(),age(),address());
	}
	@Bean
	public Person person2parameters(String name,int age,Address address3) {
		return new Person(name,age,address3);
	}
	@Bean
	public Person personqualifiers(String name,int age,@Qualifier("addressQualifier") Address address3) {
		return new Person(name,age,address3);
	}
	@Bean (name="address2")
	@Primary
	public Address address() {
		return new Address("Garay road", "Budapest");
	}
	@Bean (name="address3") // custom name
	@Qualifier("addressQualifier")
	public Address address2() {
		return new Address("RX road", "Dereccen");
	}
}
