package com.test.sql.main;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import com.test.sql.connection.ExportQueryToCsv;
import com.test.sql.utilities.PropertyReader;

public class SQLEntry {
	
	private static final String FILEPATH = null;
	private static final String STRINGCONNECTIONDB = null;
	private static final String USERNAME = null;
	private static final String PASSWORD = null;
	private static final String SQLQUERY = null;
	
	public static void sqlentry(String FILEPATH,String STRINGCONNECTIONDB, String USERNAME, String PASSWORD, String SQLQUERY) throws IOException, ParseException{
	
				
		  new PropertyReader();
		  String[] driverDB     =   new String[] {"oracle.jdbc.driver.OracleDriver"};
		  String[] charSep      =   new String[] {","};
		  Boolean colomn        =   new Boolean (true);
		 
		  //User Input
		  String[] filePath     =   new String[] {PropertyReader.FILEPATH};
		  String[] stringConnDB =   new String[] {PropertyReader.STRINGCONNECTIONDB };
		  String[] userDB       =   new String[] {PropertyReader.USERNAME};
		  String[] passDB       =   new String[] {PropertyReader.PASSWORD};
		  String[] queryDB      =   new String[] {PropertyReader.SQLQUERY};
		  		  
		try{
		    System.out.println("---------------File exist------------" + filePath[0]);
		    File fileTemp = new File(filePath[0].toString());
		    if (fileTemp.exists())
		    { 
		        fileTemp.delete();
		        System.out.println("---------------DELETE FILE------------" + filePath[0] );
		    } 
		   System.out.println("QUERY: ---->"+ queryDB[0].toString());
		 
		   ExportQueryToCsv exp = new ExportQueryToCsv(filePath,driverDB,stringConnDB,userDB,passDB,queryDB, colomn,charSep);  
		   if (fileTemp.exists())
		   { 
		     System.out.println("---File created---" + filePath[0]);
		   }

		}catch(Exception e){
		         e.printStackTrace();
		}

	}

public static void main(String[] args) throws IOException, ParseException {
	
	sqlentry(FILEPATH, STRINGCONNECTIONDB, USERNAME, PASSWORD, SQLQUERY);
}
}