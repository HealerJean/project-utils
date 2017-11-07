package com.hlj.log4j;

import org.apache.log4j.Logger;

public class Log4jTest {
    public static void main(String[] args) {  
        Logger logger = Logger.getLogger(Log4jTest.class);  
        try {
            int i = 1/0;

		} catch (Exception e) {
			System.out.println(e.getMessage()); 	
		}
        System.out.println("testlog");
        logger.info("info");  
        logger.error("error"); 
        logger.debug("debug");
        logger.warn("warn");
    }  
}
