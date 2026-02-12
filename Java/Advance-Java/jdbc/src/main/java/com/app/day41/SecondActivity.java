package com.app.day41;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SecondActivity {
	public static void main(String args[]) {
		try {
			Connection cn = MyConnection.getConnection();
			if (!cn.isClosed()) {
				Statement st = cn.createStatement();
				ResultSet rs = st.executeQuery("select * from employee");
				while (rs.next()) {
					System.out.println(rs.getString(1) + "   " + rs.getString(2) + "  " + rs.getString(3));
				}
			}
			cn.close();

		} catch (SQLException e) {
			System.out.println("Reason of the error : " + e.getMessage());
		}
	}

}
