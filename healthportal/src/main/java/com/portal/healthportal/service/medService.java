package com.portal.healthportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.healthportal.entity.medicine;
import com.portal.healthportal.repository.medrepo;

@Service
public class medService {
	@Autowired
	private medrepo mrepo;
	
	// Factory Method to create medicine objects
	public medicine createMedicine() {
		medicine m = new medicine();
		return m;
	}
	
	public void save(medicine m) {
		mrepo.save(m);
	}
	
	public List<medicine> getAllM() {
		return mrepo.findAll();
	}
	
	public Optional<medicine> getByMId(int prescription_id) {
        return mrepo.findById(prescription_id);
    }	
}