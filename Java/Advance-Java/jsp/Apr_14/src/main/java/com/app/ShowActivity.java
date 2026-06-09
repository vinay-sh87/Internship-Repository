package com.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.app.entity.Employee;
import com.app.util.HibernateUtil;

public class ShowActivity {
	public static void main(String[] args) {
		try (Session session = HibernateUtil.getFactory().openSession()) {
			Query<Employee> query = session.createQuery("from Employee", Employee.class);
			List<Employee> list = query.getResultList();

			for (Employee emp : list) {
				System.out.println(emp.getCode() + " " + emp.getName() + " " + emp.getSalary());

			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Reason of the error: " + e.getLocalizedMessage());
		}
	}
}
