package com.example.demo.Class;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PostProperties 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int prop_id;
	
	private String prop_name;
	private String email;
	private String prop_type;
	private String prop_price;
	private String prop_status;
	private String prop_subtype;
	private String prop_bedrooms;
	private String prop_bathrooms;
	private String prop_location;
	private String prop_pincode;
	private String prop_area;
	private String prop_measurement;
	private String prop_photo;
	private String prop_details;
	
	public int getProp_id() {
		return prop_id;
	}
	public void setProp_id(int prop_id) {
		this.prop_id = prop_id;
	}
	public String getProp_name() {
		return prop_name;
	}
	public void setProp_name(String prop_name) {
		this.prop_name = prop_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProp_type() {
		return prop_type;
	}
	public void setProp_type(String prop_type) {
		this.prop_type = prop_type;
	}
	public String getProp_price() {
		return prop_price;
	}
	public void setProp_price(String prop_price) {
		this.prop_price = prop_price;
	}
	public String getProp_status() {
		return prop_status;
	}
	public void setProp_status(String prop_status) {
		this.prop_status = prop_status;
	}
	public String getProp_subtype() {
		return prop_subtype;
	}
	public void setProp_subtype(String prop_subtype) {
		this.prop_subtype = prop_subtype;
	}
	public String getProp_bedrooms() {
		return prop_bedrooms;
	}
	public void setProp_bedrooms(String prop_bedrooms) {
		this.prop_bedrooms = prop_bedrooms;
	}
	public String getProp_bathrooms() {
		return prop_bathrooms;
	}
	public void setProp_bathrooms(String prop_bathrooms) {
		this.prop_bathrooms = prop_bathrooms;
	}
	public String getProp_location() {
		return prop_location;
	}
	public void setProp_location(String prop_location) {
		this.prop_location = prop_location;
	}
	public String getProp_pincode() {
		return prop_pincode;
	}
	public void setProp_pincode(String prop_pincode) {
		this.prop_pincode = prop_pincode;
	}
	public String getProp_area() {
		return prop_area;
	}
	public void setProp_area(String prop_area) {
		this.prop_area = prop_area;
	}
	public String getProp_measurement() {
		return prop_measurement;
	}
	public void setProp_measurement(String prop_measurement) {
		this.prop_measurement = prop_measurement;
	}
	public String getProp_photo() {
		return prop_photo;
	}
	public void setProp_photo(String prop_photo) {
		this.prop_photo = prop_photo;
	}
	public String getProp_details() {
		return prop_details;
	}
	public void setProp_details(String prop_details) {
		this.prop_details = prop_details;
	}
	@Override
	public String toString() {
		return "PostProperties [prop_id=" + prop_id + ", prop_name=" + prop_name + ", email=" + email + ", prop_type="
				+ prop_type + ", prop_price=" + prop_price + ", prop_status=" + prop_status + ", prop_subtype="
				+ prop_subtype + ", prop_bedrooms=" + prop_bedrooms + ", prop_bathrooms=" + prop_bathrooms
				+ ", prop_location=" + prop_location + ", prop_pincode=" + prop_pincode + ", prop_area=" + prop_area
				+ ", prop_measurement=" + prop_measurement + ", prop_photo=" + prop_photo + ", prop_details="
				+ prop_details + "]";
	}

	
	
	
	
}
