package com.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Client;
import com.app.entity.Supplier;
import com.app.util.HibernateUtil;

public class ManyToOneActivity {
	public static void main(String[] args) {
		Supplier supplier = new Supplier();
		supplier.setName("Supplier");
		Client client1 = new Client();
		client1.setClientName("Client 1");
		client1.setSupplier(supplier);
		Client client2 = new Client();
		client2.setClientName("Client 2");
		client2.setSupplier(supplier);

		Transaction transaction = null;
		try (Session session = HibernateUtil.openFactory().openSession()) {
			transaction = session.beginTransaction();

			session.persist(client1);
			session.persist(client2);

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
