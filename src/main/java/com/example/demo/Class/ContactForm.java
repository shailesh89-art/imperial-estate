package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactForm 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int contact_id;
	private String contact_name;
	private String contact_email;
	private String contact_sub;
	private String contact_msg;
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getContact_email() {
		return contact_email;
	}
	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}
	public String getContact_sub() {
		return contact_sub;
	}
	public void setContact_sub(String contact_sub) {
		this.contact_sub = contact_sub;
	}
	public String getContact_msg() {
		return contact_msg;
	}
	public void setContact_msg(String contact_msg) {
		this.contact_msg = contact_msg;
	}
	
	
	@Override
	public String toString() {
		return "ContactForm [contact_id=" + contact_id + ", contact_name=" + contact_name + ", contact_email="
				+ contact_email + ", contact_sub=" + contact_sub + ", contact_msg=" + contact_msg + "]";
	}
	
	
	
	
}
