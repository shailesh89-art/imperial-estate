package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Class.buyerRegistration;

public interface buyRepo extends JpaRepository<buyerRegistration,Integer>
{

}
