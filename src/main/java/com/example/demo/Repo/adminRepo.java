package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.adminRegistration;

@Repository
public interface adminRepo extends JpaRepository<adminRegistration,Integer>
{

}
