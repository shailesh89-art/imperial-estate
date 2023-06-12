package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Class.buyerAppointments;
@Repository
public interface appRepo extends JpaRepository<buyerAppointments,Integer>
{
	



	List<buyerAppointments> getByemail(String email);
}
