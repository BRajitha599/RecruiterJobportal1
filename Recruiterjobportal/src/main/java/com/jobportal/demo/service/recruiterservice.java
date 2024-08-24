package com.jobportal.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.demo.entity.recruiter;
import com.jobportal.demo.repository.recruiterrepository;
@Service
public class recruiterservice {
@Autowired
recruiterrepository recruiterrepo;

public void saverecruiter(recruiter rc)
{
	recruiterrepo.save(rc);
}

public ArrayList getrecruuiters() {
	// TODO Auto-generated method stub
	return null;
}

public ArrayList getrecruiter() {
	// TODO Auto-generated method stub
	return null;
}
}
