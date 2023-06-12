package com.example.demo.Repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Class.PostProperties;
import com.example.demo.Class.buyerRegistration;

public interface postproRepo extends JpaRepository<buyerRegistration,Integer>
{
	//buyerRegistration findBybuyeremail(String buyeremail);

	//List<PostProperties> getBybuyeremail(String email);

	List<PostProperties> findByBuyeremail(String email);
}
