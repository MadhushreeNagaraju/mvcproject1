package com.jsp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Dao.Dao;
import com.jsp.Entity.Employee;

@Component
public class Service {
	@Autowired
	private Dao dao ;
	
	public Employee saveEmployee(Employee employee) {
		
		if (employee != null) {
			dao.saveEmployee(employee);
			return employee ;
		}
		return null ;
	}
	
	public Employee findEmployee(int id) {
		
		return dao.findEmployeeById(id) ;

	}
	
	public Employee updateEmployee(Employee employee) {
		
		if (employee != null) {
			dao.updateEmployee(employee) ;
			return employee ;
		}
		return null ;
	}
	
	public boolean deleteEmployee(int id) {
		
		Employee emp = findEmployee(id) ;
		
		if(emp != null) {
			dao.deleteEmployee(emp) ;
			return true ;
		}
		return false ;
	}
	
}
