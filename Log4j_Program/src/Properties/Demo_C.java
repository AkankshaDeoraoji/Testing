package Properties;

import org.apache.log4j.Logger;

import com.Demo.Demo;

public class Demo_C {

	
	 static Logger log= Logger.getLogger(Demo_C.class.getName()); //Logger Object
	 
		public static void main(String[] args) 
		{
			//Layout al=new PatternLayout();
			
			//Appender ap=new ConsoleAppender(al);
			
			//log.addAppender(ap);
			
			log.debug("DEBUG");
			log.info("INFO");
			log.warn("WARN");
			log.error("ERROR");
			log.fatal("FATAL");
			
			
		}

}
