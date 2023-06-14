package com.Demo;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;

public class Demo_2_H {

	

	 static Logger log= Logger.getLogger(Demo_2_H.class.getClass()); //Logger Object
	 
	public static void main(String[] args) 
	{
		Layout al=new HTMLLayout();
		
		Appender ap=new ConsoleAppender(al);
		
		log.addAppender(ap);
		
		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");
		log.error("ERROR");
		log.fatal("FATAL");
		
		
	}
}
