package com.Hibernate_OneToMany_Demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Project 
{
	@Id @Column(name="Projrct_Id")
	private int pid;
	
	@Column(name="Project_Name")
	private String pname;
	
	@OneToMany(mappedBy="proj")
	private List<Employee> emp;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
	
	



}
