package com.jbk.Student_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class studentservice {
	@Autowired
	Studentrepositary studentRepositary;
public List<Student> getallstudent(){
	List<Student> list=new ArrayList<Student>();
	
	studentRepositary.findAll().forEach(list::add);;
	
	return list;
}

	public  void addstudent(Student s) {
		studentRepositary.save(s);
	}
	
	public Student findstudent(String id) {
		return studentRepositary.findById(id).orElse(null);
	}
	
	public Student  updatestudent(String id,Student s) {
		
		
		return studentRepositary.save(s);
	}
	
	
}
