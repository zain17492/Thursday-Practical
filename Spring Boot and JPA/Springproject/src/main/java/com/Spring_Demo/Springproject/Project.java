package com.Spring_Demo.Springproject;

public class Project 
{

	private int pid;
	private String pname;
	private String pdescription;
	
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
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", pdescription=" + pdescription + "]";
	}
	
	
	
	
}
