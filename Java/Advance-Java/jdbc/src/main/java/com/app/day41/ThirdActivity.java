package com.app.day41;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ThirdActivity {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code: ");
		int code = sc.nextInt();
		System.out.println("Enter updated salary: ");
		double salary = sc.nextDouble();
		try {
			Connection cn = MyConnection.getConnection();
			if (!cn.isClosed()) {
				Statement st = cn.createStatement();
				int a = st.executeUpdate("update employee set salary = " + salary + " where code = " + code + "");
				if (a > 0) {
					System.out.println("record updated successfully");
				}
			}
			cn.close();

		} catch (SQLException e) {
			System.out.println("Reason of the error : " + e.getMessage());
		}
	}

}
