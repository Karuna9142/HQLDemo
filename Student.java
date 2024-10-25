package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
  @Id
  private int sid;
  private String sname;
  private int age;
  private String saddress;
  
public Student()
{
	super();
}

public Student(int sid, String sname, int age, String saddress)
{
	super();
	this.sid = sid;
	this.sname = sname;
	this.age = age;
	this.saddress = saddress;
}

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getSaddress() {
	return saddress;
}

public void setSaddress(String saddress) {
	this.saddress = saddress;
}
  
  
}
