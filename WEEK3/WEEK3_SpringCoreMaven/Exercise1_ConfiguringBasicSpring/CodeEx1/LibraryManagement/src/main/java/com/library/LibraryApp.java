package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApp {
        
	   public static void main(String[] args) {
		     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		     System.out.println("IOC Container is now loaded");
	   }
} 
