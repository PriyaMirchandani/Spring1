package com.zensar.spring;

public class AnniversaryGreeting implements Greeting {

	@Override
	public String greet() {
		
		return "happy work anniversary";
	}
	public AnniversaryGreeting() {
	System.out.println("anniversary greeting created");
		
		
	}
}
