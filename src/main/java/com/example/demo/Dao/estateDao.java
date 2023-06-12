package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Class.ContactForm;
import com.example.demo.Class.PostProperties;
import com.example.demo.Class.adminRegistration;
import com.example.demo.Class.buyerAppointments;
import com.example.demo.Class.buyerRegistration;
import com.example.demo.Class.feedback;
import com.example.demo.Repo.adminRepo;
import com.example.demo.Repo.appRepo;
import com.example.demo.Repo.appointmentsRepo;
import com.example.demo.Repo.buyRepo;
import com.example.demo.Repo.buyerRepo;
import com.example.demo.Repo.contactRepo;
import com.example.demo.Repo.feedbackRepo;
import com.example.demo.Repo.postpro;
import com.example.demo.Repo.postproRepo;
import com.example.demo.Service.estateService;

@Service
public class estateDao implements estateService
{
	@Autowired
	buyerRepo er;
	
	@Autowired
	adminRepo ar;
	
	@Autowired
	appointmentsRepo ap;
	
	@Autowired
	buyRepo b;
	
	@Autowired
	contactRepo cr;
	
	@Autowired
	feedbackRepo ff;
	
	@Autowired
	postpro p;
	
	@Autowired
	postproRepo pr;
	
	@Autowired
	appRepo aR;
	

	@Override
	public List<buyerRegistration> getbuyerinfo() 
	{
		return er.findAll();
	}

	@Override
	public void newAdmin(adminRegistration aR) 
	{
		ar.save(aR);
	}

	@Override
	public List<adminRegistration> getadmininfo() 
	{
		return ar.findAll();
	}


	@Override
	public void admindel(int id) 
	{
		ar.deleteById(id);
	}

	@Override
	public void buyerdel(int id) 
	{
		er.deleteById(id);
	}

	@Override
	public adminRegistration getsingledata(int id) 
	{
		adminRegistration a = ar.getById(id);
		return a;
	}

	@Override
	public void adminupdate(adminRegistration aR) 
	{
		ar.save(aR);
	}

	@Override
	public void postprop(PostProperties PP) 
	{
		p.save(PP);
	}

	@Override
	public List<PostProperties> getpropinfo() 
	{
		return p.findAll();
	}

	@Override
	public void delprop(int id) 
	{
		p.deleteById(id);
	}

	@Override
	public adminRegistration admin_login(String email, String pass) 
	{
		return null;
	}

	@Override
	public void appointment(buyerAppointments bA) 
	{
		ap.save(bA);
	}

	@Override
	public PostProperties getpropdata(int id) 
	{
		PostProperties pm = p.getById(id);
		return pm;
	}

	@Override
	public List<buyerAppointments> appointmentinfo() 
	{
		return ap.findAll();
	}

	@Override
	public void delappoint(int id) 
	{
		ap.deleteById(id);
	}
	
	@Override
	public buyerRegistration getlogin(String buyeremail,String buyerpass) 
	{
		buyerRegistration b = er.findBybuyeremail(buyeremail);
		if(b==null || !b.getBuyerpass().equals(buyerpass))
		{
			throw new IllegalArgumentException("Invalid");
		}
		return b;
	}

	@Override
	public void buyreg(buyerRegistration brr) 
	{
		b.save(brr);
	}

	@Override
	public buyerRegistration getbuyerid(int id) 
	{
		buyerRegistration bb = er.getById(id);
		return bb;
	}

	@Override
	public void contactreg(ContactForm cF) 
	{
		cr.save(cF);
	}

	@Override
	public List<ContactForm> buyercontacts() 
	{
		return cr.findAll();
	}

	@Override
	public void delcontact(int id) 
	{
		cr.deleteById(id);
	}

	@Override
	public void feedb(feedback fb) 
	{
		ff.save(fb);
		
	}

	@Override
	public List<feedback> buyerfeedback() 
	{
		return ff.findAll();
	}


	@Override
	public List<buyerAppointments> getmyapp(String email) 
	{
		List<buyerAppointments> ba = aR.getByemail(email);
		return ba;
	}

	@Override
	public List<PostProperties> getprop(String email) {
	
		List<PostProperties> l8=p.findByEmail(email);
		return l8;
	}


	

}
