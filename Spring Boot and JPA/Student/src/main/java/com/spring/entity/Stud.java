package com.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stud 
{
	@Id
	private int sid;
	private String sname;
	private int marks;
	
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Stud [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
	public Stud(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	public Stud() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
