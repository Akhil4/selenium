/**
 * 
 */
package com.ActionDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

import org.apache.log4j.*;;
/**
 * @author training_d5.01.02
 *
 */
public class Log4demo {
	
	public static Logger logger=Logger.getLogger("LoggersLogs");

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileReader fr = new FileReader("D:\\temp\\dataRead.txt");
		BufferedReader br=new BufferedReader(fr);
		
		int i;
		while((i=br.read())!=-1)
		{
			System.out.println((char)i);
			
		}
		
		br.close();
		fr.close();
		

	}
		catch(FileAlreadyExistsException fe) {
		logger.debug("Test Manual");
		logger.error("File not found", fe);
		logger.warn("This is a warning message");
		logger.trace("This message will not be logged since log");
		}catch(IOException e)
		{
			logger.error("IOException occured:", e);
		}
		
	}
}

		


	
	