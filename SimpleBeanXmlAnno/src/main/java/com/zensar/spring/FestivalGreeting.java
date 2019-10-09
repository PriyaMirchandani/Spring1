package com.zensar.spring;

import org.springframework.stereotype.Component;

//its a pojo class
@Component
public class FestivalGreeting implements Greeting {

	@Override
	public String greet() {
		
		return "Happy Navratri";
		
	}
    public FestivalGreeting() 
    {
       System.out.println("festival greeting is created");
    }
    
    
    
    
    
    
}
