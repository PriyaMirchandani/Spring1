package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.zensar.spring.Greeting;

public class SpringMain {

	public static void main(String[] args) {
	
		/* creating object of ioc container */
		
		ApplicationContext ac= new ClassPathXmlApplicationContext("greetings.xml");
		Greeting g=ac.getBean("anniversaryGreeting", Greeting.class);		
		System.out.println(g.greet()); 
		
		Greeting g1=ac.getBean("festivalGreeting",Greeting.class);		
		System.out.println(g1.greet()); 

	}

}
