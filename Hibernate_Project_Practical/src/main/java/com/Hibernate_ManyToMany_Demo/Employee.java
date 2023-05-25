package com.Hibernate_ManyToMany_Demo;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int eid;
	
	private String ename;
	
	@ManyToMany
	@JoinTable(name="Emp_Project ",
	joinColumns= {@JoinColumn(name="eid")}, 
	inverseJoinColumns= {@JoinColumn(name="pid")})
	private List<Project> proj;

	//getter and setter methods
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public List<Project> getProj() {
		return proj;
	}

	public void setProj(List<Project> proj) {
		this.proj = proj;
	}

	//constructor
	public Employee(int eid, String ename, List<Project> proj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.proj = proj;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}


