/**
 * 
 */
package com.ActionDemo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author training_d5.01.02
 *
 */
public class calenderExtraction {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		
Calendar calendar = new GregorianCalendar(); //1st jan 1970
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayofmonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekofyear = calendar.get(Calendar.WEEK_OF_YEAR);
		System.out.println(year);
		System.out.println(month);
		System.out.println(dayofmonth);
		System.out.println(dayofweek);
		System.out.println(weekofyear);
		
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		int dayOfMonthUpdated = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("New Day" +dayOfMonthUpdated);
	}

		
}
