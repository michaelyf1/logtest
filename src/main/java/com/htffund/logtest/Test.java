package com.htffund.logtest;

import org.apache.log4j.Logger;  
import org.slf4j.LoggerFactory;  

  
/** 
 * @author   yang  fan 
 * @编写时间 20180226  
 * @文件描述: todo 
 */  
public class Test {  
      
    private static org.apache.log4j.Logger log4jLogger = Logger.getLogger(Test.class);  
    private static org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger(Test.class);  
      
    public static void main(String args[]){  
        String message = "Hello World";  
        log4jLogger.info("use log4j， message：" + message);  
        slf4jLogger.info("use slf4j，message：{}", message);  
        
        log4jLogger.debug("use log4j，debug message：" + message);
        slf4jLogger.debug("use slf4j，debug message：{}", message);
    }  
  
}  