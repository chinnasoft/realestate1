/**
*    File       :   UtilityDateHelper.java
*    Package    :   com.ariel.hmserp.utils
*    Created    :   Jan 27, 2014  2:35:51 PM
*    Project    :   Hospital Management System ERP
*    Author     :   babu
*    Company    :   Ariel Technologies PVT LTD.
**/



package com.chinnasoft.realestate.utils;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class UtilityDateHelper {
	
	public final static DateTimeZone zone = DateTimeZone.forID("Asia/Kolkata"); 
	public final static DateTimeFormatter dbfmt = DateTimeFormat.forPattern("yyyy-MM-dd");
	public final static DateTimeFormatter displayfmt = DateTimeFormat.forPattern("dd/MM/yyyy");
	public final static String dateDisplayfmt = "dd/MM/yyyy";
	public final static String dateDBfmt = "yyyy-MM-dd";
	public static final String fromDate = "00/00/0000";
	
    public static String getCurrentDBDate(){
		DateTime dt = new DateTime(zone);
		return dt.toString(dbfmt);
	}
	
	public static String getCurrentDBDateWithTime(){
		DateTime dt = new DateTime(zone);
		return dt.toString("yyyy-MM-dd HH:m:ss");
	}
	
	public static String dbDateToDisplayDateConversion(String dbDate){
		
		DateTime dt = dbfmt.parseDateTime(dbDate);
		return dt.toString(displayfmt);
	}
	
    public static String displayDateToDBDateConversion(String displayDate){
		
		DateTime dt = displayfmt.parseDateTime(displayDate);
		return dt.toString(dbfmt);
	}
    
    public static String dateConversion(String inputFormat, String inputDate, String outputFormat){
    	
    	DateTimeFormatter fmt = DateTimeFormat.forPattern(inputFormat.trim());
    	DateTime dt = fmt.parseDateTime(inputDate);
    	return dt.toString(outputFormat.trim());
    }
	
    public static Date getCurrentDBDateFormat(){
		DateTime dt = new DateTime(zone);
		return dt.toLocalDateTime().toDate();
	}
			
	public static String dbDateToDisplayDateConversionFormat(Date dbDate){
		
		DateTime dt = new DateTime(dbDate);
		return dt.toString(displayfmt);
	}
	
    public static Date displayDateToDBDateConversionFormat(String displayDate){
		
		DateTime dt = displayfmt.parseDateTime(displayDate);
		return dt.toLocalDateTime().toDate();
	}
    
    
    public static Date dateConversionFormat(String inputFormat, String inputDate){
    	
    	DateTimeFormatter fmt = DateTimeFormat.forPattern(inputFormat.trim());
    	DateTime dt = fmt.parseDateTime(inputDate);
    	return dt.toLocalDateTime().toDate();
    }
    
    public static String dateToStringConversion(Date inputDate, String outputFormat){
    	
    	DateTime dt= new DateTime(inputDate);
    	return dt.toString(outputFormat.trim());
    }
    
    public static boolean compareWithToDay(Date date){
    	LocalDate   currentDate = new LocalDate(getCurrentDBDate());
    	LocalDate   userDate = new LocalDate(date);
    	return userDate.isEqual(currentDate);
    }
    
    public static boolean compareTwoLocaleDates(Date date1, Date date2){
    	LocalDate   locale1 = new LocalDate(date1);
    	LocalDate   locale2 = new LocalDate(date2);
    	return locale2.isEqual(locale1);
    }
   
    public static Date stringtoLocalDate(String date)
    {
    	LocalDate localDate = new LocalDate(date);
    	return localDate.toDate();
    }
    
    public static Date currentLocalDate()
    {
    	LocalDate localDate = new LocalDate(zone);
    	return localDate.toDate();
    }
    @SuppressWarnings("static-access")
	public static Date dispalytoLocalDate(String date)
    {
    	LocalDate localDate = new LocalDate(zone);
    	
    	return localDate.parse(date, displayfmt).toDate();
    }
    public static Integer noOfMondaysFromTwoDates(Date fromDate, Date toDate)
    {
    	Integer noOfDays = 0;
    	
    	LocalDate startDate = new LocalDate(fromDate);
    	LocalDate endDate = new LocalDate(toDate);
    	LocalDate thisMonday = startDate.withDayOfWeek(DateTimeConstants.MONDAY);

    	if (startDate.isAfter(thisMonday)) {
    		startDate = thisMonday.plusWeeks(1); // start on next monday
    	} else {
    		startDate = thisMonday; // start on this monday
    	}

    	while (startDate.isBefore(endDate)) {
    	    System.out.println(startDate);
    	    startDate = startDate.plusWeeks(1);
    	    noOfDays=noOfDays+1;
    	}
    	
    	
    	return noOfDays;
    	
    }
    
    
    public static Integer  daysBetweenTwoDates(Date fromDate, Date toDate)
    {
    	Integer noOfDays = 0;
    	LocalDate date1 = new LocalDate(fromDate);
    	LocalDate date2 = new LocalDate(toDate);
    	Days days = Days.daysBetween(date1, date2);
    	noOfDays = days.getDays();
    	if (date1.isAfter(date2)) {
    		noOfDays = 0 - days.getDays();
		}
    	return noOfDays;
    }
    
    
    public static Integer noOfSundaysFromTwoDates(Date fromDate, Date toDate)
    {
    	Integer noOfDays = 0;
    	
    	LocalDate startDate = new LocalDate(fromDate);
    	LocalDate endDate = new LocalDate(toDate);
    	LocalDate thisMonday = startDate.withDayOfWeek(DateTimeConstants.SUNDAY);

    	if (startDate.isAfter(thisMonday)) {
    		startDate = thisMonday.plusWeeks(1); // start on next monday
    	} else {
    		startDate = thisMonday; // start on this monday
    	}

    	while (startDate.isBefore(endDate)) {
    	    System.out.println(startDate);
    	    startDate = startDate.plusWeeks(1);
    	    noOfDays=noOfDays+1;
    	}
    	
    	
    	return noOfDays;
    	
    }
    public static Integer noOfTuesdaysFromTwoDates(Date fromDate, Date toDate)
    {
    	Integer noOfDays = 0;
    	
    	LocalDate startDate = new LocalDate(fromDate);
    	LocalDate endDate = new LocalDate(toDate);
    	LocalDate thisMonday = startDate.withDayOfWeek(DateTimeConstants.TUESDAY);

    	if (startDate.isAfter(thisMonday)) {
    		startDate = thisMonday.plusWeeks(1); // start on next monday
    	} else {
    		startDate = thisMonday; // start on this monday
    	}

    	while (startDate.isBefore(endDate)) {
    	    System.out.println(startDate);
    	    startDate = startDate.plusWeeks(1);
    	    noOfDays=noOfDays+1;
    	}
    	
    	
    	return noOfDays;
    	
    }
    
    public static Integer noOfWednesdaysFromTwoDates(Date fromDate, Date toDate)
    {
    	Integer noOfDays = 0;
    	
    	LocalDate startDate = new LocalDate(fromDate);
    	LocalDate endDate = new LocalDate(toDate);
    	LocalDate thisMonday = startDate.withDayOfWeek(DateTimeConstants.WEDNESDAY);

    	if (startDate.isAfter(thisMonday)) {
    		startDate = thisMonday.plusWeeks(1); // start on next monday
    	} else {
    		startDate = thisMonday; // start on this monday
    	}

    	while (startDate.isBefore(endDate)) {
    	    System.out.println(startDate);
    	    startDate = startDate.plusWeeks(1);
    	    noOfDays=noOfDays+1;
    	}
    	
    	
    	return noOfDays;
    	
    }
    public static Integer noOfThursdaysFromTwoDates(Date fromDate, Date toDate)
    {
    	Integer noOfDays = 0;
    	
    	LocalDate startDate = new LocalDate(fromDate);
    	LocalDate endDate = new LocalDate(toDate);
    	LocalDate thisMonday = startDate.withDayOfWeek(DateTimeConstants.THURSDAY);

    	if (startDate.isAfter(thisMonday)) {
    		startDate = thisMonday.plusWeeks(1); // start on next monday
    	} else {
    		startDate = thisMonday; // start on this monday
    	}

    	while (startDate.isBefore(endDate)) {
    	    System.out.println(startDate);
    	    startDate = startDate.plusWeeks(1);
    	    noOfDays=noOfDays+1;
    	}
    	
    	
    	return noOfDays;
    	
    }
    public static Integer noOfFridaysFromTwoDates(Date fromDate, Date toDate)
    {
    	Integer noOfDays = 0;
    	
    	LocalDate startDate = new LocalDate(fromDate);
    	LocalDate endDate = new LocalDate(toDate);
    	LocalDate thisMonday = startDate.withDayOfWeek(DateTimeConstants.FRIDAY);

    	if (startDate.isAfter(thisMonday)) {
    		startDate = thisMonday.plusWeeks(1); // start on next monday
    	} else {
    		startDate = thisMonday; // start on this monday
    	}

    	while (startDate.isBefore(endDate)) {
    	    System.out.println(startDate);
    	    startDate = startDate.plusWeeks(1);
    	    noOfDays=noOfDays+1;
    	}
    	
    	
    	return noOfDays;
    	
    }
    public static Integer noOfSaturdaysFromTwoDates(Date fromDate, Date toDate)
    {
    	Integer noOfDays = 0;
    	
    	LocalDate startDate = new LocalDate(fromDate);
    	LocalDate endDate = new LocalDate(toDate);
    	LocalDate thisMonday = startDate.withDayOfWeek(DateTimeConstants.SATURDAY);

    	if (startDate.isAfter(thisMonday)) {
    		startDate = thisMonday.plusWeeks(1); // start on next monday
    	} else {
    		startDate = thisMonday; // start on this monday
    	}

    	while (startDate.isBefore(endDate)) {
    	    System.out.println(startDate);
    	    startDate = startDate.plusWeeks(1);
    	    noOfDays=noOfDays+1;
    	}
    	
    	
    	return noOfDays;
    	
    }
    
    public static String getDayName(Date date)
    {
    	LocalDate   locale1 = new LocalDate(date);
    	return locale1.toString("EEEE");
    }
    public static String getDayName(String date, String inputFormat)
    {
    	DateTimeFormatter fmt = DateTimeFormat.forPattern(inputFormat.trim());
    	LocalDate   locale1 = fmt.parseLocalDate(date);
    	return locale1.toString("EEEE");
    }
    public static String getMonthName(Date date)
    {
    	LocalDate   locale1 = new LocalDate(date);
    	return locale1.toString("MMMM");
    }
    public static String getMonthName(String date, String inputFormat)
    {
    	DateTimeFormatter fmt = DateTimeFormat.forPattern(inputFormat.trim());
    	LocalDate   locale1 = fmt.parseLocalDate(date);
    	return locale1.toString("MMMM");
    }
    public static String getYearName(Date date)
    {
    	LocalDate   locale1 = new LocalDate(date);
    	return locale1.toString("yyyy");
    }
    public static String getYearName(String date, String inputFormat)
    {
    	DateTimeFormatter fmt = DateTimeFormat.forPattern(inputFormat.trim());
    	LocalDate   locale1 = fmt.parseLocalDate(date);
    	return locale1.toString("yyyy");
    }
    public static Date minuDates(Date date, Integer period ,String minuFormat){
    	LocalDate   locale1 = new LocalDate(date);
    	if(minuFormat.equalsIgnoreCase("D"))
    	{
    		locale1 = locale1.minusDays(period);
    	}else if(minuFormat.equalsIgnoreCase("M")){
    		locale1 = locale1.minusMonths(period);
    	}else if(minuFormat.equalsIgnoreCase("Y"))
    	{
    		locale1 = locale1.minusYears(period);
    	}
    	return locale1.toDate();
    }
    public static Date plusDates(Date date, Integer period ,String minuFormat){
    	LocalDate   locale1 = new LocalDate(date);
    	if(minuFormat.equalsIgnoreCase("D"))
    	{
    		locale1 = locale1.plusDays(period);
    	}else if(minuFormat.equalsIgnoreCase("M")){
    		locale1 = locale1.plusMonths(period);
    	}else if(minuFormat.equalsIgnoreCase("Y"))
    	{
    		locale1 = locale1.plusYears(period);
    	}
    	return locale1.toDate();
    }
    
    
    
    
    
   

}


