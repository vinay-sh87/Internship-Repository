package com.app.day41;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FirstActivity {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		try {
			Connection cn = MyConnection.getConnection();
			if (!cn.isClosed()) {
				Statement st = cn.createStatement();
				int a = st.executeUpdate("insert into employee(name,salary) values('" + name + "'," + salary + ")");
				if (a > 0) {
					System.out.println("record inserted successfully");
				}
			}
			cn.close();

		} catch (SQLException e) {
			System.out.println("Reason of the error : " + e.getMessage());
		}
	}

}
