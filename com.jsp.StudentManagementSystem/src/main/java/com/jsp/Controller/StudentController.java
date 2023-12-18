package com.jsp.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.jsp.Entity.Student;
import com.jsp.Service.StudentService;

@Controller

public class StudentController {
	@Autowired
	
	private StudentService service;
	@RequestMapping("save")
	public ModelAndView saveStudent(ModelAndView mav,Student student) {
		mav.addObject("student", student);
		mav.setViewName("createStudent.jsp");
		return mav;	
	}
	
	@RequestMapping(value = "saveStudent", method = RequestMethod.POST)
	public ModelAndView saveStudentToDb(@ModelAttribute Student student,ModelAndView mav ) {
		service.saveStudent(student) ;
		mav.setViewName("index.jsp");
		return mav ;
	}
	
	@RequestMapping("find")
	
	public ModelAndView finStudent(ModelAndView mav) {
		mav.setViewName("findStudent.jsp");
		return mav;	
	}
	@RequestMapping(value = "findStudent", method = RequestMethod.POST)
	public ModelAndView displyfindStudent(HttpServletRequest request, ModelAndView mav) {
		int id = Integer.parseInt(request.getParameter("id")) ;
		Student student = service.findStudent(id) ;
		
		if(student != null) {
		mav.addObject("student", student) ;
		mav.setViewName("displayStudent.jsp");
		return mav ;
		}else {
			mav.addObject("msg", "Eee object illa kano looo") ;
			mav.setViewName("index.jsp");
			return mav ;
		}
	}
	@RequestMapping("update")
	public ModelAndView updateStudent(ModelAndView mav) {
		mav.setViewName("updateStudent.jsp");
		return mav ;
	}
	
	@RequestMapping(value = "updateStudent")
	public ModelAndView updateStudentDetails(HttpServletRequest request,ModelAndView mav) {
		
		int id = Integer.parseInt(request.getParameter("id")) ;
		
		Student student = service.findStudent(id) ;
		
		if(student!= null) {
		
		mav.addObject("student", student) ;
		
		mav.setViewName("displayUpdatingStudent.jsp");
		
		return mav ;
		}else {
			mav.addObject("msg", "Eee object Upadte madake object nim appa kodtana") ;
			mav.setViewName("index.jsp");
			return mav ;
		}
		
		
		
	}
	
	@RequestMapping(value = "saveupdate", method = RequestMethod.POST)
	public ModelAndView saveUpdatedStudnet(@ModelAttribute Student student, ModelAndView mav) {
		
		service.updateStudent(student);
		mav.addObject("msg", "Updated successfully...!") ;
		mav.setViewName("index.jsp");
		return mav ;
		
	}
	
	@RequestMapping(value = "delete")
	public ModelAndView deleteStudent(ModelAndView mav) {
		mav.setViewName("delete.jsp");
		return mav ;
	}
	
	@RequestMapping(value = "deleteStudent")
	public ModelAndView removeStudent(HttpServletRequest request,ModelAndView mav) {
		
		int id = Integer.parseInt(request.getParameter("id")) ;
		
		Student student = service.findStudent(id) ;
		
		if(student != null) {
		service.deleteStudent(id) ;
		mav.addObject("msg", "Deleted successfully...!") ;
		mav.setViewName("index.jsp");
		return mav ;
		}else {
			mav.addObject("msg", "Student does not exits please check the Id") ;
			mav.setViewName("index.jsp");
			return mav ;
		}
				
	}
	

}
