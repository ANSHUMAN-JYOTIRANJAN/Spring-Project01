package com.anshuman.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1: Spring Context
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
		//configure the things that we want to spring Framework - @configuration
		 //HelloWorldConfiguration-@Configuration
		 //name-@Bbean
		 //3:Retrieving Beans managed by Spring
		 System.out.println(context.getBean("name"));
		 System.out.println(context.getBean("age"));
		 System.out.println(context.getBean("person"));
		 System.out.println(context.getBean("Person"));
		 System.out.println(context.getBean("address2"));
		 System.out.println(context.getBean("methodCall"));
//		 System.out.println(context.getBean(Address.class));//Alternative  approach for this
		 System.out.println(context.getBean("address3"));
		 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		 		
		 System.out.println(context.getBean("person5Qualifier"));
		}
		}
		
	}


