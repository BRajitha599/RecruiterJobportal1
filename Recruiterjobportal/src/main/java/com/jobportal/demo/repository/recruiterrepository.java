package com.jobportal.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobportal.demo.entity.recruiter;
@Repository
public interface recruiterrepository extends JpaRepository<recruiter,Integer> {



}
