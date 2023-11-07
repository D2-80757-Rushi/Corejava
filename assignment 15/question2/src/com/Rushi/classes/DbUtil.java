package com.Rushi.classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	public static final String DB_Driver="com.mysql.cj.jdbc.Driver";
	public static final String DB_USERNAME="D3_80812_Gaurav";
	public static final String DB_PASSWORD="0981";
    public static final String DB_URL= "jdbc:mysql://localhost:3306/test";
    static {
    	try {
    	Class.forName(DB_Driver);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    public static Connection getConnection()
    {
    	Connection con=null;
    	try {
    	con=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
    	return con;
    	}
    	catch(Exception e){
    		e.printStackTrace();
    		return null;
    	}
    }
}
