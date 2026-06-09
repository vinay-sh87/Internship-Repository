package com.app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Categories;
import com.app.entity.Items;
import com.app.util.HibernateUtil;

public class ManyToManyActivity {
	public static void main(String[] args) {

		Categories categories = new Categories();
		categories.setId(101);
		categories.setCatName("Fashion");

		Categories categories2 = new Categories();
		categories.setId(102);
		categories.setCatName("Watches");

		Items items = new Items();
		items.setItemId(444);
		items.setItemName("Titan Octane");

		Items items2 = new Items();
		items2.setItemId(555);
		items2.setItemName("Peter England");

		Set set = new HashSet();
		set.add(items);
		set.add(items2);

		categories.setItems(set);

		Set watches = new HashSet();
		watches.add(items);

		Items items3 = new Items();
		items3.setItemId(666);
		items3.setItemName("Titan Edge");

		watches.add(items3);

		categories.setItems(watches);

		Transaction transaction = null;
		try (Session session = HibernateUtil.openFactory().openSession()) {
			transaction = session.beginTransaction();
			session.persist(categories);
			session.persist(categories2);
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
