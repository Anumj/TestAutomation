package com.qa.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneralUtilityHelper {
	public String getCurrentDate() throws Exception {
		try {
			DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
			Date date = new Date();
			String filePathdate = dateFormat.format(date).toString();
			return filePathdate;
		} catch (Exception e) {
			throw new Exception(getExceptionMessage(), e);
		}
	}

	/**
	 * Method to GET the current date in the date format ddMMMyyyy
	 * 
	 * @author sanojs
	 * @since 20-04-2020
	 * @throws AutomationException
	 */
	public String getCurrentDateInFormatddMMMyyyy() throws Exception {
		try {
			DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
			Date date = new Date();
			String filePathdate = dateFormat.format(date).toString();
			return filePathdate;
		} catch (Exception e) {
			throw new Exception(getExceptionMessage(), e);
		}
	}

	/**
	 * Method to GET a current date in the date format ddMMyyyy
	 * 
	 * @author sanojs
	 * @since 20-04-2020
	 * @throws AutomationException
	 */
	public String getCurrentDateInFormatddMMyyyy() throws Exception {
		try {
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			Date date = new Date();
			String filePathdate = dateFormat.format(date).toString();
			return filePathdate;
		} catch (Exception e) {
			throw new Exception(getExceptionMessage(), e);
		}
	}

	/**
	 * Method to GET the day from the current date
	 * 
	 * @author sanojs
	 * @throws Exception 
	 * @since 20-04-2020
	 * @throws AutomationException
	 */
	public String getDayFromCurrentDate() throws Exception 
	{
		try {
			DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss");
			Date date = new Date();
			String filePathdate = dateFormat.format(date).toString();
			String day = filePathdate.substring(0, 2);
			return day;
		} catch (Exception e) {
			throw new Exception(getExceptionMessage(), e);
		}
	}

	private String getExceptionMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Method to CONVERT a double value to an Integer
	 * 
	 * @author sanojs
	 * @since 20-04-2020
	 * @param doubleValue
	 * @throws AutomationException
	 */
	public int convertDoubleToInt(double doubleValue) throws Exception {
		try {
			int intValue = (int) doubleValue;
			return intValue;
		} catch (Exception e) {
			throw new Exception(getExceptionMessage(), e);
		}
	}
	/**
	 * Method to CONVERT a float value to an Integer
	 * 
	 * @author sanojs
	 * @since 20-04-2020
	 * @param floatValue
	 * @throws AutomationException
	 */
	public int convertFloatToInt(float floatValue) throws Exception {
		try {
			int intValue = (int) floatValue;
			return intValue;
		} catch (Exception e) {
			throw new Exception(getExceptionMessage(), e);
		}
	}

	/**
	 * Method to CONVERT a string value to an Integer
	 * 
	 * @author sanojs
	 * @since 20-04-2020
	 * @param stringValue
	 * @throws AutomationException
	 */
	public int convertStringToInt(String stringValue) throws Exception {
		try {
			int intValue = Integer.parseInt(stringValue);
			return intValue;
		} catch (Exception e) {
			throw new Exception(getExceptionMessage(), e);
		}
	}

	/**
	 * Method to CONVERT a string value to a double value
	 * 
	 * @author sanojs
	 * @since 20-04-2020
	 * @param stringValue
	 * @throws AutomationException
	 */
	public double convertStringToDouble(String stringValue) throws Exception {
		try {
			double doubleValue = Double.parseDouble(stringValue);
			return doubleValue;
		} catch (Exception e) {
			throw new Exception(getExceptionMessage(), e);
		}
	}

	/**
	 * Method to CONVERT an Integer to a string value
	 * 
	 * @author sanojs
	 * @since 20-04-2020
	 * @param intValue
	 * @throws AutomationException
	 */
	public String convertIntToString(int intValue) throws Exception {
		try {
			String stringValue = String.valueOf(intValue);
			return stringValue;
		} catch (Exception e) {
			throw new Exception(getExceptionMessage(), e);
		}
	}

	/**
	 * Method to CONVERT a double value to a string value
	 * 
	 * @author sanojs
	 * @since 20-04-2020
	 * @param doubleValue
	 * @throws AutomationException
	 */
	public String convertDoubleToString(double doubleValue) throws Exception {
		try {
			String stringValue = String.valueOf(doubleValue);
			return stringValue;
		} catch (Exception e) {
			throw new Exception(getExceptionMessage(), e);
		}
	}

	/**
	 * Method to CONVERT a string value to a long value
	 * 
	 * @author sanojs
	 * @since 20-04-2020
	 * @param doubleValue
	 * @throws AutomationException
	 */
	public long convertStringToLong(String stringValue) throws Exception {
		try {
			long longValue = Long.parseLong(stringValue);
			return longValue;
		} catch (Exception e) {
			throw new Exception(getExceptionMessage(), e);
		}
	}


}
