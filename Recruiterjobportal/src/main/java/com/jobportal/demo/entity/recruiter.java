package com.jobportal.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class recruiter {

	@Id
	private int rid;
	private String rname;
	private String rcompany;
	private String address;
	private long phno;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRcompany() {
		return rcompany;
	}
	public void setRcompany(String rcompany) {
		this.rcompany = rcompany;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	
}
