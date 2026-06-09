package com.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Employee;
import com.app.util.HibernateUtil;

public class UpdateEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code: ");
		int code = sc.nextInt();
		System.out.println("Update Name: ");
		String name = (new Scanner(System.in)).nextLine();
		
		Transaction transaction = null;
		try(Session session = HibernateUtil.getFactory().openSession()){
			transaction = session.beginTransaction();
			Employee employee = session.find(Employee.class, code);
			employee.setName(name);
			session.merge(employee);
			
			transaction.commit();
			System.out.println("Record has been Updated!");
		}catch (Exception e) {
			if(transaction != null || transaction.isActive()) {
				transaction.rollback();
			}
			System.out.println("Reason of the error : "+e.getLocalizedMessage());
		}
	}
}
