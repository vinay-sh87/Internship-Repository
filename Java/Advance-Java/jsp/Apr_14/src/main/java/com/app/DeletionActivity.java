package com.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Employee;
import com.app.util.HibernateUtil;

public class DeletionActivity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code: ");
		int _code = sc.nextInt();
		Employee emp = new Employee();
		emp.setCode(_code);

		Transaction transaction = null;
		try (Session session = HibernateUtil.getFactory().openSession()) {
			transaction = session.beginTransaction();
			session.remove(emp);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null || transaction.isActive()) {
				transaction.rollback();
			}
			System.out.println("Reason of the error : " + e.getLocalizedMessage());
		}
	}

}
