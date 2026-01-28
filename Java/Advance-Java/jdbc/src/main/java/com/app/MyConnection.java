package com.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	public static Connection getConnection() throws Exception {
		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mlk?autoReconnect=true&useSSL=false","root","vinay@0011");
	}

}
