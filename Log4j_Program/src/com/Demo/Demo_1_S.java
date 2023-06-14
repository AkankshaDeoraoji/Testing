package com.Demo;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;


public class Demo_1_S {

	

	 static Logger log= Logger.getLogger(Demo_1_S.class.getClass()); //Logger Object
	 
	public static void main(String[] args) 
	{
		Layout al=new SimpleLayout();
		
		Appender ap=new ConsoleAppender(al);
		
		log.addAppender(ap);
		
		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");
		log.error("ERROR");
		log.fatal("FATAL");
		
		
	}
}
