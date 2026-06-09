package com.example.spring_framework_basics;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {

	// @Autowired //field dependency injection
	Dependency1 depend1;
	// @Autowired
	Dependency2 depend2;

	// @Autowired // constructor based dependency injection
	public YourBusinessClass(Dependency1 depend1, Dependency2 depend2) {
		super();
		System.out.println("Constructor based dependency injection");
		this.depend1 = depend1;
		this.depend2 = depend2;
	}

	// @Autowired // setter based dependency injection
	public void setDepend1(Dependency1 depend1) {
		this.depend1 = depend1;
	}

	// @Autowired
	public void setDepend2(Dependency2 depend2) {
		this.depend2 = depend2;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("using ").append(depend1).append(" and ").append(depend2);

		return sb.toString();
	}
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DependentInjectionLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(DependentInjectionLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(YourBusinessClass.class));
		}
//context.close() will automatically happen
		
		 
		


	}
}



