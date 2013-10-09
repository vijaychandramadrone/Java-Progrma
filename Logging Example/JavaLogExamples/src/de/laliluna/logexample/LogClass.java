package de.laliluna.logexample;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogClass {
	private static org.apache.log4j.Logger log = Logger.getLogger(LogClass.class);
	public static void main(String[] args)
	{
    PropertyConfigurator.configure("E:\\Java Programes\\Logging Example\\JavaLogExamples\\logs\\log4j.properties");
	log.trace("Trace");
	log.debug("Debug");
	log.info("Info");
	log.warn("Warn");
	log.error("Error");
	log.info("Info details");
	log.fatal("Fatal");
	}

}
