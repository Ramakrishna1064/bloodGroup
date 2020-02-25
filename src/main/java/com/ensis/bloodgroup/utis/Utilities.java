/**
 * 
 */
package com.ensis.bloodgroup.utis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Ensis
 *
 */
public class Utilities {

	
	public static String convertDateAndTimeFormat(Date date) {

		SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		//System.out.println("Format 1:   " + dateFormatter.format(date));
		return dateFormatter.format(date);
	}
	
	public static String convertOnlyDateFormat(Date date) {

		SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
		//System.out.println("Format 1:   " + dateFormatter.format(date));
		return dateFormatter.format(date);
	}
	
	public static Date getDateAndTimeFormat(String dateAndTimeString) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			Date date = simpleDateFormat.parse(dateAndTimeString);
			return date;
		} catch (ParseException ex) {
			System.out.println("Exception " + ex);
			return null;
		}
	}
	
	
	public static Date getDateFormat(String dateString) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = simpleDateFormat.parse(dateString);
			return date;
		} catch (ParseException ex) {
			System.out.println("Exception " + ex);
			return null;
		}
	}
	
	public static int getInteger(String stringValue) {

		return Integer.parseInt(stringValue);
	}
}
