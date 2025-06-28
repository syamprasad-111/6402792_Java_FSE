package com.SLF4JLogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
	private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);
	
	public static void main(String[] args) {
		System.out.println("App is started.");

        logger.info("This is INFO message");
        logger.warn("This is WARNING message");
        logger.error("This is ERROR message");

        System.out.println("App is Finished.");
	}

}
