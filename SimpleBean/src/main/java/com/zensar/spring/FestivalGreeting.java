package com.zensar.spring;
//its a pojo class
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
