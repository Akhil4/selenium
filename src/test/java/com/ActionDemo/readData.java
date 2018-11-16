/**
 * 
 */
package com.ActionDemo;

import java.io.*;

/**
 * @author training_d5.01.02
 *
 */
public class readData {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\temp\\dataRead.txt");
		BufferedReader br=new BufferedReader(fr);
		
		int i;
		while((i=br.read())!=-1)
		{
			System.out.println((char)i);
			
		}
		
		br.close();
		fr.close();
		
		
	}

}
