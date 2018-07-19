package com.test.sql.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    public static String FILEPATH;
    public static String STRINGCONNECTIONDB;
    public static String USERNAME;
    public static String PASSWORD;
    public static String SQLQUERY;

    public PropertyReader() throws IOException {
    	String iniFile="config/property.ini";

        Properties prop = new Properties();
        InputStream fis = new FileInputStream(new File(iniFile));
        prop.load(fis);
           
        FILEPATH = prop.getProperty("FILEPATH");
        STRINGCONNECTIONDB = prop.getProperty("STRINGCONNECTIONDB");
        USERNAME = prop.getProperty("USERNAME");
        PASSWORD = prop.getProperty("PASSWORD");
        SQLQUERY = prop.getProperty("SQLQUERY");
        
    }

}
