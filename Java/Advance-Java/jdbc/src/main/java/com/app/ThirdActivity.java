package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ThirdActivity {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code to get information.");
		int code = sc.nextInt();
		try {
			Connection cn = MyConnection.getConnection();
			if (!cn.isClosed()) {
				PreparedStatement ps = cn.prepareStatement("select * from employee where code = ?");
				ps.setInt(1, code);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					System.out.println(rs.getMetaData().getColumnLabel(1) + "::" + rs.getInt(1));
					System.out.println(rs.getMetaData().getColumnLabel(2) + "::" + rs.getString(2));
					System.out.println(rs.getMetaData().getColumnLabel(3) + "::" + rs.getDouble(3));
				} else {
					System.out.println("Record not found with the code...");
				}
			}
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
