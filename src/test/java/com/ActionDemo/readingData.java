/**
 * 
 */
package com.ActionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author training_d5.01.02
 *
 */
public class readingData {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("C:\\selenium_workspace\\SeleniumLatest\\src\\test\\resources\\test.properties");
		FileInputStream fileInput = new FileInputStream(file);
		
		Properties properties = new Properties();
		
		properties.load(fileInput);
		fileInput.close();
		
		Enumeration enuKeys = properties.keys();
		//writing into properties file
		
		/*
		FileInputStream fout=new FileInputStream(file);
		properties.store("testkey", "test value1");
		fout.close();
		*/
		
		while(enuKeys.hasMoreElements()) 
		{
			String key = (String)enuKeys.nextElement();
			String value = properties.getProperty(key);
			System.out.println(key + " " + value );
		
		
		}
		
		//writing data and changes can be seen in the properties file we created
		//under src/test/resources
		
		FileOutputStream fout=new FileOutputStream(file);
		properties.setProperty("xpath", "\frames");
		properties.store(fout, null);
		fout.close();
		
		
		
	}

}
