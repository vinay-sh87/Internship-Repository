package com.app.day42;

import java.sql.Connection;
import java.sql.Types;
import java.util.Scanner;

import java.sql.CallableStatement;

public class FirstActivity {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code");
		int code = sc.nextInt();
		try {
			Connection cn = MyConnection.getConnected();
			if(!cn.isClosed()) {
				CallableStatement csbt = cn.prepareCall("{call getSalary(?)}");
				csbt.setInt(1, code);
				csbt.registerOutParameter(1, Types.DOUBLE);
				csbt.execute();
				System.out.println("The salary of the employee:: "+csbt.getString(1));
			}
			
		}catch(Exception e) {
			System.out.println("Reason of the error : "+e.getMessage());
		}
	}
}
