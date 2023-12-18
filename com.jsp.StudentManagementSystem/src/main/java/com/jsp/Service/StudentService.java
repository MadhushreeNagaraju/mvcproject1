package com.jsp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.Dao.StudentDao;

import com.jsp.Entity.Student;

@Component

public class StudentService {
	@Autowired
	private StudentDao dao;
	public Student saveStudent(Student student) {
		if(student!=null)
		{
			dao.saveStudent(student);
			return student;
		}
		
		return null;
		
	}
	
	public Student findStudent(int sid) {
		
			return dao.findStudentById(sid);	
	}
	
	public Student updateStudent(Student student) {
		if(student!=null) {
			dao.updateStudent(student);
			return student;
			
		}
		return null;
		}
	
	public boolean deleteStudent(int id) {
			
		Student student= findStudent(id) ;
		if(student!=null) {
			dao.deleteStudent(student);
			return true;
		}
		return false;
		
	}
}
