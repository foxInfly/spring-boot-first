package com.pupu.log4j;

import org.apache.log4j.Logger;

/**
 *
 */
public class LoggerTest {
 
    private static Logger logger = Logger.getLogger ( LoggerTest.class ) ;
 
    public static void main(String[] args) {
        
        logger.debug("Debug ...");
 
        logger.info("Info ...");
 
        logger.warn("Warn ...");
 
        logger.error("Error ...");
        new Thread(()->{
            String name ="poupu";
            System.out.println("hello...");
            logger.info("hello:pupu");
        }).start();
        try {

            int status = 5;
            int stau = 0;
            stau = 2/stau;
        } catch (Exception e) {
//            e.printStackTrace();
            logger.error("错误",e);
        }

    }
 
}