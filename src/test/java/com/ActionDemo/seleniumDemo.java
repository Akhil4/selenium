/**
 * 
 */
package com.ActionDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author training_d5.01.02
 *
 */
public class seleniumDemo {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date date=new Date();
			//display time and date using toString
		
		System.out.println(date.toString());
	//to display date we got into various formats we used SimpleDateFormat class
		SimpleDateFormat pattern=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current date: " +  pattern.format(date));
		
	//code for calculating the difference between two given times
		
		String time1 = "16:00:00";
		String time2 = "19:00:00";
		SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss");
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		long difference = date2.getTime() - date1.getTime();
		System.out.println("Difference is:::::" +difference);
		
		//comparing 2 dates directly by using compareTo function
		
		Date date3 = new Date();
		Date date4 = new Date();
		int cmp=date1.compareTo(date2);
		int comparison = date3.compareTo(date4);
		System.out.println(comparison);
		System.out.println(cmp);
		
		//to work on system calender and nextract info fro  their direcly
		
		
				
		
		
		// date formatters
		// E - DATE, YYYY- YEAR, MM- MONTH

	}

}
