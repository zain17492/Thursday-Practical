package com.Hibernate_Demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student 
{
	@Id @Column(name="Student_Id")
	private int sid;
	
	@Column(name="Student_Name")
	private String sname;
	
	@Column(name="Student_Age")
	private int sage;

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

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}	

}
