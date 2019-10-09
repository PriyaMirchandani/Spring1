package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

public class ZensarIdolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext ac=new  ClassPathXmlApplicationContext("Performer.xml");
       Performer p=ac.getBean("Pyare Mohan", Performer.class);
       p.perform();
       Performer p1=ac.getBean("katrina kaif", Performer.class);
       p1.perform();
	}

}
