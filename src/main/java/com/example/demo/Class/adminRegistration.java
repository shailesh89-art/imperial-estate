package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class adminRegistration
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int admin_id;
	private String admin_name;
	private String admin_number;
	private String admin_email;
	private String admin_pass;
	private String admin_cpass;
	
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_number() {
		return admin_number;
	}
	public void setAdmin_number(String admin_number) {
		this.admin_number = admin_number;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public String getAdmin_pass() {
		return admin_pass;
	}
	public void setAdmin_pass(String admin_pass) {
		this.admin_pass = admin_pass;
	}
	public String getAdmin_cpass() {
		return admin_cpass;
	}
	public void setAdmin_cpass(String admin_cpass) {
		this.admin_cpass = admin_cpass;
	}
	
	@Override
	public String toString() {
		return "adminRegistration [admin_id=" + admin_id + ", admin_name=" + admin_name + ", admin_number="
				+ admin_number + ", admin_email=" + admin_email + ", admin_pass=" + admin_pass + ", admin_cpass="
				+ admin_cpass + "]";
	}
	
	
	
	
	
}
