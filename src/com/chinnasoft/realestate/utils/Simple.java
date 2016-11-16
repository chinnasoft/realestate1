package com.chinnasoft.realestate.utils;

	import java.util.Date;
    import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import org.jasypt.util.password.ConfigurablePasswordEncryptor;


    public class Simple {
      public static void main(String[] args) {
    String startDateString = "27/06/2007";
      DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
      Date startDate;
    /*  try {
          startDate = df.parse(startDateString);
          String newDateString = df.format(startDate);
          System.out.println(newDateString);
      } catch (Exception e) {
          e.printStackTrace();
      }
    	  SimpleDateFormat originalFormat = new SimpleDateFormat("dd/MM/yyyy");
    	   SimpleDateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd" );
    	   DateTimeFormatter dbfmt = DateTimeFormat.forPattern("yyyy-MM-dd");
    	   Date date;
    	   try {
    	     date = originalFormat.parse("21/6/2013");
    	     //System.out.println("New Format :   " +targetFormat.);

    	    } catch (ParseException ex) {

    	       }*/

       	/*DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy".trim());
       	
       	LocalDate dt = fmt.parseLocalDate("01/01/2014");*/
     
      Simple sm =new Simple();
    System.out.println( sm.passwordEncrypt("chinni")); 
      
      }
  
      

    	public  String passwordEncrypt(String userPassword){
    		String result = "";
    		ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();
    		passwordEncryptor.setAlgorithm("MD5");
    		passwordEncryptor.setPlainDigest(true);
    		passwordEncryptor.setStringOutputType("UTF-8");
    		result = passwordEncryptor.encryptPassword(userPassword);
    		return result;
    		
    	}
    }