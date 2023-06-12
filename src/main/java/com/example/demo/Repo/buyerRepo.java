package com.example.demo.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.buyerRegistration;

@Repository
public interface buyerRepo extends JpaRepository<buyerRegistration,Integer>
{

	 public buyerRegistration findBybuyeremail(String email);
	
}
