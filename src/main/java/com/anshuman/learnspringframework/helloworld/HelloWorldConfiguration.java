package com.anshuman.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
record Person(String name, int age) {};
//Address - firstname & city
record person2(String name, int  age, Address address) {};
record Address(String dist, String state) {};
@Configuration
public class HelloWorldConfiguration {
	//
	@Bean
	public String name() {
		return "Anshu";
	}
	@Bean
	public int age() {
		return 13;
	}
	@Bean
	public Person person() {
		var person = new Person("Ravi",21);
		return person;
	}
	@Bean
	public person2 Person(String name, int age, Address address2) {
		return new person2(name ,age,address2);
	}
	@Bean
	public person2 methodCall() {
		return new person2(name() ,age(),address());
	}
	@Bean
	@Primary
	public person2 methodCall1() {
		return new person2(name() ,age(),address3());
	}
	@Bean
	public person2 person5Qualifier( String name,int age,@Qualifier("address3qualifier")Address address) {
		return new person2(name() ,age(),address3());
	}
	@Bean(name = "address2")
	@Primary // Which is most Important
	public Address address() {
		return new Address("lokhandabala","Navi mumbai");
	}
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("lokhandabala","Navi mumbai");
	}
}
