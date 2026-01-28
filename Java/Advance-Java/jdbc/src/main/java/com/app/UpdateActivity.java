package com.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateActivity {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of the data that you want to update: ");
		int code = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the updated name: ");
		String name = sc.nextLine();
		System.out.println("Enter the updated salary: ");
		double salary = sc.nextDouble();
		try {
			Connection cn = MyConnection.getConnection();
			PreparedStatement ps = cn.prepareStatement("update employee set name = ?, salary = ? where code = ?");
			ps.setString(1, name);
			ps.setDouble(2, salary);
			ps.setInt(3, code);
			int a = ps.executeUpdate();
			if(a>0) {
				System.out.println("employee information upated successfully");
			}else {
				System.out.println("no employee found with the given code");
			}
		}catch(Exception e) {
			System.out.println("Reason of the error: "+e.getMessage());
		}
	}
}
