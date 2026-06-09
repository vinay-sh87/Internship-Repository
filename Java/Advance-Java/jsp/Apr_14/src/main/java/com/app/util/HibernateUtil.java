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
			if (sessionFactory == null) {
				StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
				MetadataSources sources = new MetadataSources(serviceRegistry);
				Metadata metadata = sources.getMetadataBuilder().build();
				sessionFactory = metadata.getSessionFactoryBuilder().build();
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new ExceptionInInitializerError(e);
		}
		return sessionFactory;
	}

	public static SessionFactory getFactory() {
		return sessionFactory;
	}

	public static void shutDown() {
		sessionFactory.close();
	}
}
