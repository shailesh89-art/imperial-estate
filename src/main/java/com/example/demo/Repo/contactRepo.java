package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.ContactForm;

@Repository
public interface contactRepo extends JpaRepository<ContactForm,Integer>
{

}
