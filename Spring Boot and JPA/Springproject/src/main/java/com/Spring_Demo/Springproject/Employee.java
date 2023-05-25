package com.Spring_Demo.Springproject;

public class Employee 
{
	private int eid;
	private String ename;
	private int esalaray;
	private String ecity;
	
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
	public int getEsalaray() {
		return esalaray;
	}
	public void setEsalaray(int esalaray) {
		this.esalaray = esalaray;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalaray=" + esalaray + ", ecity=" + ecity + "]";
	}
	
	
	
	

}
