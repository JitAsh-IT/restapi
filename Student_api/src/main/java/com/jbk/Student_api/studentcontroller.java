package com.jbk.Student_api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController   // dif is java ka object ko json me convert karta hai restcontroller means  response controller body 
public class studentcontroller {
	
	@Autowired
	studentservice Studentservice;
	@CrossOrigin
	@RequestMapping("/Student")
 public List<Student> getAllstudent(){
		return Studentservice.getallstudent();
	}
	@RequestMapping(method=RequestMethod.POST,value="/Student")
	void addstudent(@RequestBody Student s) {
		
		Studentservice.addstudent(s);
		
	}
	@RequestMapping(method=RequestMethod.GET,value="/Student/{id}")
	public Student findstudent(@RequestBody Student s,@PathVariable String id) {
		return Studentservice.findstudent(id);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/Student/{id}")
public Student updatestudent(@RequestBody Student s,@PathVariable String id) {
	return Studentservice.updatestudent(id,s);
	
}
}
