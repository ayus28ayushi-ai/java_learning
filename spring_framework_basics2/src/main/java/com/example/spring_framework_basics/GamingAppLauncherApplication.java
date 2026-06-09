package com.example.spring_framework_basics;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//------------LAZY ANNOTATION-----------------------
@Component
class ClassA {

}

@Component
@Lazy // this prevents spring to create an object until someone actually tries to use
		// it. errors in spring configuration will not be discovered at the application
		// startup. they will become runtime errors. rarely used .
//lazy behavior by using @Lazy or @Lazy(value = true)

//default behavior is EAGER INITIALISATION. which instantiates everything at the startup. errors in spring configuration are discovered during startup of the application
//eager can be used by saying @Lazy(value = false) or putting nothing
class ClassB {
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("Some initialization logic");
		this.classA = classA;
	}

	public void someMethod() {
		System.out.println("Some Method");
	}

}

//------------------Bean Scope-------------------------
@Component
class Singleton {
//by default have a EAGER BEHAVIOR (can be overridden)
}

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Prototype {
//by default have a LAZY BBEHAVIOR (can be overridden)
}

//-------------------PreDestroy and PostConstruct---------------
@Component
class SomeDependency {
	public void getReady() {
		System.out.println("Ready!Logic using dependencies");
	}
}

@Component
class SomeClass {
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready");

	}

	@PostConstruct // immediately after dependency injection is done
	public void initialize() {
		someDependency.getReady();
	}

	@PreDestroy // immediately before bean destruction
	public void cleanup() {
		System.out.println("Cleanup");
	}

}
//----------------Configuration--------------------------------
@Configuration // marks the class as the source of bean definition for the spring IOC container
@ComponentScan
//("com.example.spring_framework_basics.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
//			context.getBean(GamingConsole.class).up();
//			context.getBean(GameRunner.class).run();
//			System.out.println("Initialisation of content is done");
//			// context.getBean(ClassB.class).someMethod();
//
//			System.out.println(context.getBean(Singleton.class)); // these have the same hashcode since it has one
//																	// instance per container
//			System.out.println(context.getBean(Singleton.class));
//
//			System.out.println(context.getBean(Prototype.class)); // a new instance everytime
//			System.out.println(context.getBean(Prototype.class));
//			System.out.println(context.getBean(Prototype.class));



		}
//context.close() will automatically happen
		
		 
		


	}

}
