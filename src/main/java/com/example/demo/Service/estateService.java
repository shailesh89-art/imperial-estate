package com.example.demo.Service;

import java.util.List;

import com.example.demo.Class.ContactForm;
import com.example.demo.Class.PostProperties;
import com.example.demo.Class.adminRegistration;
import com.example.demo.Class.buyerAppointments;
import com.example.demo.Class.buyerRegistration;
import com.example.demo.Class.feedback;

public interface estateService 
{
	void buyreg(buyerRegistration brr);
	
	List<buyerRegistration> getbuyerinfo();
	
	void newAdmin(adminRegistration aR);
	
	List<adminRegistration> getadmininfo();
	
	adminRegistration admin_login(String email,String pass);
	
	buyerRegistration getlogin(String buyeremail, String buyerpass);
	
	void admindel(int id);
	
	void buyerdel(int id);
	
	adminRegistration getsingledata(int id);
	
	buyerRegistration getbuyerid(int id);
	
	void adminupdate(adminRegistration aR);
	
	
	//PostProperties
	
	void postprop(PostProperties PP);
	
	List<PostProperties> getpropinfo();
	
	void delprop(int id);
	
	PostProperties getpropdata(int id);
	
	List<PostProperties> getprop(String email);
	
	
	//appointment section
	
	void appointment (buyerAppointments bA);
	
	List<buyerAppointments> appointmentinfo();
	
	void delappoint(int id);
	
	List<buyerAppointments> getmyapp(String email);
	
	
	// Contact form
	
	void contactreg (ContactForm cF);
	
	List<ContactForm> buyercontacts();
	
	void delcontact(int id);
	
	//feedback 
	
	void feedb(feedback fb);
	
	List<feedback> buyerfeedback();
    
	
}
