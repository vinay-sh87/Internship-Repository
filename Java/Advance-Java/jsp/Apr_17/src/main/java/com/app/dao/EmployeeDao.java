package com.app.dao;

import java.sql.Blob;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.app.entity.Employee;
import com.app.util.HibernateUtil;
import com.app.entity.VisualData;

public class EmployeeDao {
	public String insertEmployee(String name, double salary) {
		String _status = "success";
		Employee employee = new Employee();
		employee.setName(name);
		employee.setSalary(salary);
		Transaction transaction = null;
		try (Session session = HibernateUtil.openFactory().openSession()) {
			transaction = session.beginTransaction();
			session.persist(employee);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null || transaction.isActive()) {
				_status = "failed";
				transaction.rollback();
			}
		}
		return _status;
	}

	public String insertVisualData(String name, Blob image) {
		String _status = "success";
		VisualData visualData = new VisualData();
		visualData.setName(name);
		visualData.setImage(image);
		Transaction transaction = null;
		try (Session session = HibernateUtil.openFactory().openSession()) {
			transaction = session.beginTransaction();
			session.persist(visualData);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null || transaction.isActive()) {
				_status = "failed";
				transaction.rollback();
			}
		}
		return _status;
	}

	public Blob imageData(int code) {
		Blob image = null;
		Transaction transaction = null;
		try (Session session = HibernateUtil.openFactory().openSession()) {
			transaction = session.beginTransaction();
			VisualData data = session.find(VisualData.class, code);
			transaction.commit();
			image = data.getImage();

		} catch (Exception e) {
			if (transaction != null && transaction.isActive()) {
				transaction.rollback();
			}
		}
		return image;
	}

	public List<VisualData> allEmployees() {
		List<VisualData> visual = null;
		try (Session session = HibernateUtil.openFactory().openSession()) {
			Query<VisualData> query = session.createQuery("from VisualData", VisualData.class);
			visual = query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return visual;
	}
}
