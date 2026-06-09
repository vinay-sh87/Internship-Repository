package com.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Employee;
import com.app.util.HibernateUtil;

public class FirstActivity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		
		Employee emp = new Employee(name,salary);
		Transaction transaction = null;
		
		try {
			Session session = HibernateUtil.getFactory().openSession();
			transaction = session.beginTransaction();
			session.persist(emp);
			
			transaction.commit();
			session.close();
			System.out.println("Record Inserted");
			
		} catch (Exception e) {
			// TODO: handle exception
			if(transaction != null || transaction.isActive()) {
				transaction.rollback();
			}
			System.out.println("Exception raised: "+e.getMessage());
		}
		
	}
}
