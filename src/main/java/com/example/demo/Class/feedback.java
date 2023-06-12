package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class feedback 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String bname;
	private String feedback_msg;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getFeedback_msg() {
		return feedback_msg;
	}
	public void setFeedback_msg(String feedback_msg) {
		this.feedback_msg = feedback_msg;
	}
	
	@Override
	public String toString() {
		return "feedback [id=" + id + ", bname=" + bname + ", feedback_msg=" + feedback_msg + "]";
	}
	
	
}
