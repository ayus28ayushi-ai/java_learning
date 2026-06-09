package com.example.spring_framework_basics.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1. launch spring context
		// 2. configure the things we want spring to manage- @Configuration

		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("Mr. Bean"));
		System.out.println(context.getBean("personMethodCall"));
		System.out.println(context.getBean("add"));
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean(Person.class));
		System.out.println("Trying qualifier" + context.getBean("personParameter"));

		System.out.println("Printing the beans");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

	}
}
}
