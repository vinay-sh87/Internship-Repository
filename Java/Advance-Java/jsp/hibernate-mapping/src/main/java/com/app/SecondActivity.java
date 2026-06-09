package com.app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Customer;
import com.app.entity.Vendor;
import com.app.util.HibernateUtil;

public class SecondActivity {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCname("Vinay");
		Customer customer1 = new Customer();
		customer1.setCname("User 2");
		Customer customer2 = new Customer();
		customer2.setCname("User 3");

		Set set = new HashSet();
		set.add(customer);
		set.add(customer1);
		set.add(customer2);

		Vendor vendor = new Vendor();
		vendor.setName("Vendor Name");
		vendor.setChildren(set);

		Transaction transaction = null;
		try (Session session = HibernateUtil.openFactory().openSession()) {
			transaction = session.beginTransaction();
			session.persist(vendor);

			transaction.commit();
			System.out.println("Record Inserted");
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction.isActive() || transaction != null) {
				transaction.rollback();
			}
			System.out.println("Transaction failed: " + e.getMessage());
		}

	}
}
