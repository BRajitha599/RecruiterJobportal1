package com.jobportable.demo.controller;
import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.demo.entity.recruiter;
import com.jobportal.demo.service.recruiterservice;

@RestController
public class recruitercontroller {

	@Autowired
	recruiterservice  service;
	
	@PostMapping("/saverecruiter")
	public String insertrecruiter (@RequestBody recruiter rc)
	{
		service.saverecruiter(rc);
		return " recruiter saved successfully";
	}
	@GetMapping("/getrecruiterData")
	 ArrayList getrecruiter()
	{
	    ArrayList list;
		list=(ArrayList) service.getrecruiter();
				return list;
	}
	
    
}
