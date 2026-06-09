package com.app;

import java.util.Scanner;

import org.hibernate.Session;

import com.app.util.HibernateUtil;

import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

public class ProcedureActivity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code: ");
		int _code = sc.nextInt();
		try (Session session = HibernateUtil.getFactory().openSession()) {
			StoredProcedureQuery query = session.createStoredProcedureQuery("getName");
			query.registerStoredProcedureParameter("_code", Integer.class, ParameterMode.IN);
			query.registerStoredProcedureParameter("_name", String.class, ParameterMode.OUT);

			query.setParameter("_code", _code);
			query.execute();
			String _name = (String) query.getOutputParameterValue("_name");
			System.out.println("The name of the employee: " + _name);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The reason of the error : " + e.getLocalizedMessage());
		}
	}

}
