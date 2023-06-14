package FileAppender;

import java.io.IOException;

import org.apache.log4j.Appender;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;


public class Demo_S {

	static Logger log= Logger.getLogger(Demo_S.class.getClass()); //Logger Object
	 
	public static void main(String[] args) throws IOException 
	{
		Layout al=new SimpleLayout();
		
		Appender ap=new FileAppender(al,"abc.txt");
		
		log.addAppender(ap);
		
		log.debug("DEBUG");
		log.info("INFO");
		log.warn("WARN");
		log.error("ERROR");
		log.fatal("FATAL");
		
		
	}
}
