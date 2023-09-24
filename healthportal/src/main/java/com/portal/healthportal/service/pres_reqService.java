package com.portal.healthportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.healthportal.entity.Pres_req;
import com.portal.healthportal.repository.pres_reqRepository;

@Service
public class pres_reqService {
	@Autowired
	private pres_reqRepository repo;
	public List<Pres_req> getAllP()
	{
		return repo.findAll();
		}
	

}
