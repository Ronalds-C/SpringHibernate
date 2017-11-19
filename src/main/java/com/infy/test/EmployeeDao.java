package com.infy.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public String addEmployee(Employee employee){
		try{
			Session session = sessionFactory.openSession();
			session.getTransaction().begin();
			session.persist(employee);
			session.getTransaction().commit();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			return "error";
		}
		return "Employee added to DB";
	}
}
