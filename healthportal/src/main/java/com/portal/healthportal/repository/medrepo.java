package com.portal.healthportal.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portal.healthportal.entity.medicine;
@Repository
public interface medrepo extends JpaRepository<medicine,Integer>{

	    //List<medicine> findByPrescription_id(int prescription_id);
	 
	
	}



