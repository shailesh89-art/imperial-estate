package com.example.demo.Controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Class.ContactForm;
import com.example.demo.Class.PostProperties;
import com.example.demo.Class.adminRegistration;
import com.example.demo.Class.buyerAppointments;
import com.example.demo.Class.buyerRegistration;
import com.example.demo.Service.estateService;
import com.example.demo.Class.feedback;


@Controller
@ComponentScan(basePackages= {"com.example.demo.Controller"})
public class estateController
{
	@Autowired
	estateService es;
	
	
	
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/appointment")
	public String appointment(@RequestParam("id") int id, ModelMap m)
	{
		PostProperties PP = es.getpropdata(id);
		m.addAttribute("PP", PP);
		return "appointment";
	}
	
	@PostMapping("/appoint")
	public String appoint(@ModelAttribute("bA") buyerAppointments bA)
	{
		es.appointment(bA);
		return "redirect:/buyerDashboard";
	}
	
	
	@RequestMapping("/buyerLogin")
	public String buyerLogin()
	{
		return "buyerLogin";
	}
	
	@PostMapping("/byreg")
	public String byreg(@ModelAttribute("bR") buyerRegistration bR, HttpSession session)
	{
		session.setAttribute("p1", bR.getBuyername());
		session.setAttribute("p2", bR.getBuyeremail());
		session.setAttribute("p3", bR.getBuyernumber());
		session.setAttribute("p4", bR.getBuyerpass());
		session.setAttribute("p5", bR.getBuyercpass());
		es.buyreg(bR);
		
		return "buyerLogin";
	}
	
	@PostMapping("/buyerlog")
	public String buyerlog(@RequestParam("buyeremail") String buyeremail,@RequestParam("buyerpass") String buyerpass, HttpSession session)
	{
		
		try 
		{
			buyerRegistration b = es.getlogin(buyeremail,buyerpass);
			if(b!=null)
			{
				session.setAttribute("p1", b.getBuyername());
				session.setAttribute("p2", b.getBuyeremail());
				session.setAttribute("buyeremail", buyeremail);
				return "redirect:/buyerDashboard";
			}
		}
		catch(Exception e)
		{
			// TODO: handle exception
		}
		return "buyerLogin";
	}
	
	@RequestMapping("/adminLogin")
	public String adminLogin()
	{
		return "adminLogin";
	}
	
	@PostMapping("/adminlog")
	public String adminlog(ModelMap m,@RequestParam String admin_email,@RequestParam String admin_pass)
	{
		
		if(admin_email.equals("admin") && admin_pass.equals("aditya"))
		{
			m.put("admin_email", admin_email);
			return "redirect:/adminDashboard";
		}
		
		else
		{
			return "redirect:/adminLogin";
		}
	}
	
	@RequestMapping("/buyerDashboard")
	public String buyerDashboard()
	{
		
		return "buyerDashboard";
	}
	
	@RequestMapping("/buyerAbout")
	public String buyerAbout()
	{
		
		return "buyerDashboard";
	}
	
	@RequestMapping("/property_type")
	public String property_type()
	{
		
		return "property_type";
	}
	
	
//-------------------------------------------------------------------------------------------------------------------------//	
	// contact form
	@RequestMapping("/contact_us")
	public String contact_us()
	{
		return "contact_us";
	}
	
	@RequestMapping("/contact")
	public String contact(@ModelAttribute("cF") ContactForm cF)
	{
		es.contactreg(cF);
		return "contact_us";
	}
	
	

	//-------------------------------------------------------------------------------------------------------------------------//
	
	@RequestMapping("/profile")
	public String profile()
	{
		return "profile";
	}
	
	@RequestMapping("/updateProfile")
	public String updateProfile()
	{
		return "updateProfile";
	}
	@RequestMapping("/updated_Profile")
	public String updated_Profile()
	{
		return "redirect:/profile";
	}
	
	

	//-------------------------------------------------------------------------------------------------------------------------//
	
	// Properties 
	
	@RequestMapping("/property_list")
	public String property_list(Model m)
	{
		List<PostProperties> p = es.getpropinfo();
		m.addAttribute("p", p);
		return "property_list";
	}
	
	
	@RequestMapping("/myProperties")
	public String myProperties(ModelMap m,@ModelAttribute("pr") PostProperties pr,@RequestParam("email") String email)
	{
		
		List<PostProperties> l8=es.getprop(email);
		Iterator<PostProperties> i1=l8.iterator();
		while(i1.hasNext())
		{
			 System.out.println(i1.next());
		}
		m.addAttribute("l8",l8);
		  
		  return "myProperties";
	}
	
	
	@RequestMapping("/postProperties")
	public String postProperties()
	{
		return "postProperties";
	}
	
	
	@RequestMapping("/view_estate")
	public String view_estate(@RequestParam("id") int id, ModelMap m)
	{
		PostProperties PP = es.getpropdata(id);
		m.addAttribute("PP", PP);
		return "view_estate";
	}
	
	
	@RequestMapping("/edit_property")
	public String edit_property(@RequestParam("id") int id, ModelMap m)
	{
		PostProperties PP = es.getpropdata(id);
		m.addAttribute("PP", PP);
		return "edit_property";
	}
	
	
	@PostMapping("/postProperty")
	public String postProp(@RequestParam("filename") MultipartFile prop_photo,@ModelAttribute("PP") PostProperties PP)
	{
		try {
			String filename = prop_photo.getOriginalFilename();
			String path = "C:\\Users\\Lenovo\\eclipse-workspace\\Imperial_estate\\src\\main\\resources\\static\\BuyerImg";
			byte [] filedata = prop_photo.getBytes();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(path+"/"+filename));
			bout.write(filedata);
			bout.flush();
			bout.close();
			PP.setProp_photo(filename);
			es.postprop(PP);
			
			return "redirect:/buyerDashboard";
			
		}
		catch(Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			return "Error Uploading file: " + e.getMessage();
		}
		
	}

	@RequestMapping("/delete_property")
	public String delete_property(@RequestParam("id") int id)
	{
		es.delprop(id);
		return "delete_property";
	}
	
	
	@RequestMapping("/propDelete")
	public String propDelete(@RequestParam("id") int id)
	{
		es.delprop(id);
		return "redirect:/adminAllprop";
	}

	//-------------------------------------------------------------------------------------------------------------------------//
	
	@RequestMapping("/logout")
	public String logout()
	{
		return "logout";
	}
	

	//-------------------------------------------------------------------------------------------------------------------------//
	
	@RequestMapping("/myAppointments")
	public String myAppointments(ModelMap m, @ModelAttribute("ba") buyerAppointments ba, @RequestParam("email") String email)
	{
		List<buyerAppointments> pp = es.getmyapp(email);
		   Iterator<buyerAppointments> o1 = pp.iterator();
		   while(o1.hasNext())
		   {
			   System.out.println(o1.next());
			  
		   }
		   m.addAttribute("pa",pp);
		   return "myAppointments";
	}
	
	
	@RequestMapping("/delete_appointment")
	public String delete_appointment(@RequestParam("id") int id)
	{
		es.delappoint(id);
		return "myAppointments";
	}
	

	//-------------------------------------------------------------------------------------------------------------------------//
	
	//  ADMIN 
	
	
	@RequestMapping("/adminDashboard")
	public String adminDashboard(Model m)
	{
		List<PostProperties> p1 = es.getpropinfo();
		m.addAttribute("p1", p1);
		return "adminDashboard";
	}
	

	@RequestMapping("/adminAllprop")
	public String adminAllprop(Model m)
	{
		List<PostProperties> p1 = es.getpropinfo();
		m.addAttribute("p1", p1);
		return "adminAllprop";
	}
	
	
	@RequestMapping("/adminAppointments")
	public String adminAppointments(Model m)
	{
		List<buyerAppointments> bA = es.appointmentinfo();
		m.addAttribute("bA", bA);
		return "adminAppointments";
	}
	
	
	@RequestMapping("/delAdm_appointment")
	public String delAdm_appointment(@RequestParam("id") int id)
	{
		es.delappoint(id);
		return "redirect:/adminAppointments";
		
	}
	
	
	@RequestMapping("/admin_buyerDetails")
	public String admin_buyerDetail(Model m)
	{
		List<buyerRegistration> l1=es.getbuyerinfo();
		m.addAttribute("l1", l1);
		return "admin_buyerDetails";
	}
	
	
	@RequestMapping("/buyerDelete")
	public String buyerDelete(@RequestParam("id") int id)
	{
		es.buyerdel(id);
		return "redirect:/admin_buyerDetails";
	}
	
	
	@RequestMapping("/admin_details")
	public String admin_buyerDetails(Model m)
	{
		List<adminRegistration> a1=es.getadmininfo();
		m.addAttribute("a1", a1);
		return "admin_details";
	}
	
	
	@RequestMapping("/adminProfile")
	public String adminProfile(@RequestParam("id") int id, ModelMap m)
	{
		adminRegistration aR = es.getsingledata(id);
		m.addAttribute("aR", aR);
		return "adminProfile";
	}
	
	
	@RequestMapping("/admin_update")
	public String admin_update(@ModelAttribute("aR") adminRegistration aR)
	{
		es.adminupdate(aR);
		return "redirect:/admin_details";
	}
	
	
	@RequestMapping("/adminDelete")
	public String adminDelete(@RequestParam("id") int id)
	{
		es.admindel(id);
		return "redirect:/admin_details";
	}
	
	
	@RequestMapping("/adminSwitch")
	public String adminSwitch()
	{
		return "adminSwitch";
	}
	
	
	@RequestMapping("/adminReg")
	public String adminReg()
	{
		return "adminReg";
	}
	
	@RequestMapping("/delAdm_contact")
	public String delAdm_contact(@RequestParam("id") int id)
	{
		es.delcontact(id);
		return "adminAppointments";
		
	}
	
	
	@PostMapping("/newAdmin")
	public String newAdmin(@ModelAttribute("aR") adminRegistration aR)
	{
		es.newAdmin(aR);
		return "redirect:/admin_details";
	}
	
	@RequestMapping("/adminContact")
	public String adminContact(Model m)
	{
		List<ContactForm> cf = es.buyercontacts();
		m.addAttribute("cf", cf);
		return "adminContact";
	}
	
	@RequestMapping("/adminFeedback")
	public String adminFeedback(Model m)
	{
		List<feedback> cf = es.buyerfeedback();
		m.addAttribute("cf", cf);
		return "adminFeedback";
	}
	
	@RequestMapping("/adminLogout")
	public String adminLogout()
	{
		return "adminLogout";
	}
	
	
	//--------------------------------------------------------------------------------------------------------------------//
	
	@RequestMapping("/feedback")
	public String feedback(@ModelAttribute("fb") feedback fb)
	{
		es.feedb(fb);
		return "buyerDashboard";
	}
	
	
	 
	/*@PostMapping("/postProperty")
	 public String displaydata(@RequestParam("email") String email,ModelMap m,HttpServletRequest request)
	 {
		
		   List<PostProperties> pp=es.getmyprop(email);
		   Iterator<PostProperties> o1 = pp.iterator();
		   while(o1.hasNext())
		   {
			   System.out.println(o1.next());
			  
		   }
		   m.addAttribute("pp",pp);
		  return "myProperties";
	 }*/
	 
	
}
