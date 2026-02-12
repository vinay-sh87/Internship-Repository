package com.app.day41;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mlk?autoReconnect=true&useSSL=false", "root",
				"vinay@0011");
	}
}
