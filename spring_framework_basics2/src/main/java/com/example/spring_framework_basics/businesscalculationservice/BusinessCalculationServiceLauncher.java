package com.example.spring_framework_basics.businesscalculationservice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.spring_framework_basics.businesscalculationservice")
public class BusinessCalculationServiceLauncher {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BusinessCalculationServiceLauncher.class)) {
			int max = context.getBean(BusinessCalculationService.class).findMax();
			System.out.println("Max: " + max);
		}

	}

}
