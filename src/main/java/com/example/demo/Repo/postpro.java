package com.example.demo.Repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.PostProperties;

@Repository
public interface postpro extends JpaRepository<PostProperties,Integer>
{

	List<PostProperties> findByEmail(String email);

	
	
}
