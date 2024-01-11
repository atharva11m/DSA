package com.demo.beans;

public class Employee {
	private int pid;
	private String pname;
	private String gender;
	public Employee() {
		super();
	}
	public Employee(int pid, String pname, String gender) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.gender = gender;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [pid=" + pid + ", pname=" + pname + ", gender=" + gender + "]";
	}
	
}
