package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class buyerRegistration 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String buyername;
	private String buyernumber;
	private String buyeremail;
	private String buyerpass;
	private String buyercpass;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBuyername() {
		return buyername;
	}
	public void setBuyername(String buyername) {
		this.buyername = buyername;
	}
	public String getBuyernumber() {
		return buyernumber;
	}
	public void setBuyernumber(String buyernumber) {
		this.buyernumber = buyernumber;
	}
	public String getBuyeremail() {
		return buyeremail;
	}
	public void setBuyeremail(String buyeremail) {
		this.buyeremail = buyeremail;
	}
	public String getBuyerpass() {
		return buyerpass;
	}
	public void setBuyerpass(String buyerpass) {
		this.buyerpass = buyerpass;
	}
	public String getBuyercpass() {
		return buyercpass;
	}
	public void setBuyercpass(String buyercpass) {
		this.buyercpass = buyercpass;
	}
	
	
	@Override
	public String toString() {
		return "buyerRegistration [id=" + id + ", buyername=" + buyername + ", buyernumber=" + buyernumber
				+ ", buyeremail=" + buyeremail + ", buyerpass=" + buyerpass + ", buyercpass=" + buyercpass + "]";
	}
	
	
	
	
}
