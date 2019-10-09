package com.zensar.spring.performers;

public class Juggler implements Performer {

	private int beanBags;
	
	public Juggler() {
	System.out.println("No argument constructor of juggler");
	}
	
	public Juggler(int beanBags) {
	super();
	this.beanBags = beanBags;
	System.out.println("parametrized constructor of juggler");
	}

    @Override
	public void perform() {
	System.out.println("juggler juggling bean bags "+beanBags);	

	}

}
