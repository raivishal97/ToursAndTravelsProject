package com.training.utils;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class DBConnections {

	public static Connection getOracleConnection() {
		Connection con = null;
		
		try {
			
			Properties props = new Properties();
			
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			
			InputStream inStream = classLoader.getResourceAsStream("/DBConnection.properties");
			
		
			
//			FileInputStream inStream = new FileInputStream(new File("DBConnection.properties"));
			
			props.load(inStream);
			
			Class.forName(props.getProperty("db.oracle.driverClass"));
			
			con = DriverManager.getConnection(props.getProperty("db.oracle.url"),props.getProperty("db.oracle.userName"),props.getProperty("db.oracle.password"));
			
			
		} catch (SQLException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} 
		
		return con;
	}
}
