package com.app.util;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.SessionFactory;

public class HibernateUtil {
	private static SessionFactory sessionFactory = getSessionFactory();

	private static SessionFactory getSessionFactory() {
		try {
			sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure().build())
					.getMetadataBuilder().build().getSessionFactoryBuilder().build();
		} catch (Exception e) {
			// TODO: handle exception
			throw new ExceptionInInitializerError(e);
		}
		return sessionFactory;
	}

	public static SessionFactory openFactory() {
		return sessionFactory;
	}

	public static void shutDown() {
		sessionFactory.close();
	}
}
