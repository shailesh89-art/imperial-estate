package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class buyerAppointments 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int appoint_id;
	private String appoint_name;
	private String appoint_phone;
	private String email;
	private String appoint_subject;
	private String appoint_msg;
	public int getAppoint_id() {
		return appoint_id;
	}
	public void setAppoint_id(int appoint_id) {
		this.appoint_id = appoint_id;
	}
	public String getAppoint_name() {
		return appoint_name;
	}
	public void setAppoint_name(String appoint_name) {
		this.appoint_name = appoint_name;
	}
	public String getAppoint_phone() {
		return appoint_phone;
	}
	public void setAppoint_phone(String appoint_phone) {
		this.appoint_phone = appoint_phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAppoint_subject() {
		return appoint_subject;
	}
	public void setAppoint_subject(String appoint_subject) {
		this.appoint_subject = appoint_subject;
	}
	public String getAppoint_msg() {
		return appoint_msg;
	}
	public void setAppoint_msg(String appoint_msg) {
		this.appoint_msg = appoint_msg;
	}
	
	
	@Override
	public String toString() {
		return "buyerAppointments [appoint_id=" + appoint_id + ", appoint_name=" + appoint_name + ", appoint_phone="
				+ appoint_phone + ", email=" + email + ", appoint_subject=" + appoint_subject + ", appoint_msg="
				+ appoint_msg + "]";
	}
	
	
	
	
	
	
	
}
