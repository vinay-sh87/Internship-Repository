package com.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Address;
import com.app.entity.Student;
import com.app.util.HibernateUtil;

public class FirstActivity {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Vinay Sharma");
		student.setCourse("Java");
		Address address = new Address();
		address.setAddress("Siddharth Nagar");
		address.setState("Uttar Pradesh");
		address.setPincode(272192);
		student.setAddress(address);
		address.setStudent(student);
		

		Transaction transaction = null;
		try (Session session = HibernateUtil.openFactory().openSession()) {
			transaction = session.beginTransaction();
			session.persist(student);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
		}
	}
}
