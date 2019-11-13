package com.jbk.Student_api;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private String id;
private String name;
private String lname;

//public Student(int id, String name, String lname) {
// super();
// this.id=id;
// this.name=name;
// this.lname=lname;
//}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", lname=" + lname + "]";
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}


}
