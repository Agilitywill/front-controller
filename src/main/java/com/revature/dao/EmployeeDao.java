package com.revature.dao;

import java.util.List;

// persistence logic hibernate logic
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Employee;
import com.revature.util.HibernateUtil;

public class EmployeeDao {
	
	// insert employee object by calling save() method from hibernate, return pk
	public int insert(Employee e) {
		
		Session ses = HibernateUtil.getSession(); 
		
		Transaction tx = ses.beginTransaction(); 
		
		int pk = (int) ses.save(e); 
		
		tx.commit();
		
		return pk; 
		
	}
	
	public List<Employee> findAll() {
		
		Session ses = HibernateUtil.getSession(); 
		
		List<Employee> emps = ses.createQuery("from Employee", Employee.class).list(); 
		
		
		return emps; 
		
	}
	
	public boolean delete(int id) {
		return false;
		
	}
	
	public boolean update(Employee e) {
		return false;
		
	}

}
