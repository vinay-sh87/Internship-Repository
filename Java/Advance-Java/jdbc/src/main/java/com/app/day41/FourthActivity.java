package com.app.day41;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class FourthActivity {
	public static void main(String args[]) {
		try {
			Connection cn = MyConnection.getConnection();
			String name = "person1";
			double salary = 10000;
			if (!cn.isClosed()) {
				// with Statement
				Statement st = cn.createStatement();
				st.executeUpdate("insert into employee(name, salary) values('" + name + "', " + salary + ")");

				name = "person2";
				salary = 20000;
				st.executeUpdate("insert into employee(name, salary) values('" + name + "', " + salary + ")");

				name = "person3";
				salary = 30000;
				st.executeUpdate("insert into employee(name, salary) values('" + name + "', " + salary + ")");

				// with PreparedStatement
				PreparedStatement ps = cn.prepareStatement("insert into employee(name,salary) values (?,?)");
				ps.setString(1, "person4");
				ps.setDouble(2, 40000);
				ps.executeUpdate();

				ps.setString(1, "person5");
				ps.setDouble(2, 50000);
				ps.executeUpdate();

				ps.setString(1, "person6");
				ps.setDouble(2, 60000);
				ps.executeUpdate();

			}
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
