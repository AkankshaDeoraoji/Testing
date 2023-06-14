package com.Demo;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.XMLLayout;


public class Demo_3_X {

	
	 static Logger log= Logger.getLogger(Demo_3_X.class.getClass()); //Logger Object
	 
		public static void main(String[] args) 
		{
			Layout al=new XMLLayout();
			
			Appender ap=new ConsoleAppender(al);
			
			log.addAppender(ap);
			
			log.debug("DEBUG");
			log.info("INFO");
			log.warn("WARN");
			log.error("ERROR");
			log.fatal("FATAL");
			
			
		}
}
