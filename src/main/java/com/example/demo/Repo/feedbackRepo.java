package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Class.feedback;

@Repository
public interface feedbackRepo extends JpaRepository<feedback,Integer>
{

}
