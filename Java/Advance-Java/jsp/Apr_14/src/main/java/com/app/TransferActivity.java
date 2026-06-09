package com.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Account;
import com.app.util.HibernateUtil;

public class TransferActivity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source account number : ");
		int source = sc.nextInt();
		System.out.println("Enter the target account number : ");
		int target = sc.nextInt();
		System.out.println("Enter the amount to be transferred :");
		int amount = sc.nextInt();

		Transaction transaction = null;
		try (Session session = HibernateUtil.getFactory().openSession()) {
			transaction = session.beginTransaction();
			Account source_account = session.find(Account.class, source);
			Account target_account = session.find(Account.class, target);

			source_account.setAmount(source_account.getAmount() - amount);
			target_account.setAmount(target_account.getAmount() + amount);

			session.merge(source_account);
			session.merge(target_account);

			transaction.commit();
			System.out.println("Transaction successful!");

		} catch (Exception e) {
			if (transaction != null || transaction.isActive()) {
				transaction.rollback();
				System.out.println("Transaction failed!");
			}
		}
	}
}
