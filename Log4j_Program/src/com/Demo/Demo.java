package com.Demo;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Demo
{
	 static Logger log= Logger.getLogger(Demo.class.getClass()); //Logger Object
	 
	public static void main(String[] args) 
	{
		Layout al=new PatternLayout();
		
		Appender ap=new ConsoleAppender(al);
		
		log.addAppender(ap);
		
		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");
		log.error("ERROR");
		log.fatal("FATAL");
		
		
	}

}
