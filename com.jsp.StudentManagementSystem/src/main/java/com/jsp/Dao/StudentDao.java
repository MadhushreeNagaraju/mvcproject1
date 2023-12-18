package com.jsp.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.jsp.Entity.Student;

@Component

public class StudentDao {
	@Autowired
	private EntityManager entityManager;
	
	public Student saveStudent(Student student) {
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(student);
		transaction.commit();
		return student;
		
	}
	
	public Student findStudentById(int sid) {
		
		return entityManager.find(Student.class, sid);
		
	}
	
public Student updateStudent(Student student) {
		
		EntityTransaction transaction = entityManager.getTransaction() ;
		
		transaction.begin();
	    entityManager.merge(student) ;
	    transaction.commit();
	    
	    return student ;
	}

public boolean deleteStudent(Student student) {
	EntityTransaction transaction = entityManager.getTransaction();
	transaction.begin();
	entityManager.remove(student);
	transaction.commit();
	return true;
	
}
	
}
