package com.portal.healthportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.portal.healthportal.entity.Pres_req;
import com.portal.healthportal.service.pres_reqService;

import ch.qos.logback.core.model.Model;

@Controller
public class healthPortal {
  @GetMapping("/")
  public String home() {
	  return "home";
  }
  @Autowired
  private pres_reqService prs;
  @GetMapping("/viewall")
  public ModelAndView getall() {
	 List<Pres_req>list=prs.getAllP();
	 ModelAndView m =new ModelAndView();
	 m.setViewName("viewall");
	 m.addObject("l",list);
	 return m;
  }
}
