package com.example.spring_framework_basics.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration { // this class contains the beans that we would want to manage using spring

	@Bean
	public String name() {
		return "Ayushi Singh";
	}

	@Bean
	public int age() {
		return 19;
	}

	@Bean(name = "Mr. Bean")

	public Person person1() {
		return new Person("Sheldon Lee Cooper", 43, new Address("New York", "USA"));
	}

	@Bean
	@Primary
	public Person personMethodCall() {
		return new Person(name(), age(), address1());
	}

	@Bean

	public Person personParameter(String name, int age, @Qualifier("address2qualifier") Address someAddress) {
		// if you use qualifier then you can name it anything and not just "address2".
		// but if you have not used qualifier then you need to match the parameter with
		// the bean name
		return new Person(name, age, someAddress);
	}

	@Bean(name = "add")
	@Primary
	public Address address1() {
		return new Address("G-306, Amaatra Homes", "Greater Noida");
	}

	@Bean
	@Qualifier("address2qualifier")
	public Address address2() {
		return new Address("Paris", "France");
	}
}
