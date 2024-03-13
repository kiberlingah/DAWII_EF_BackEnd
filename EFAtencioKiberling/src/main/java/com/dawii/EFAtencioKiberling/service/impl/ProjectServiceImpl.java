package com.dawii.EFAtencioKiberling.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.EFAtencioKiberling.model.Project;
import com.dawii.EFAtencioKiberling.repo.ProjectRepo;
import com.dawii.EFAtencioKiberling.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{
   @Autowired
   ProjectRepo projectrepo;
	
	@Override
	public List<Project> list() {
		// TODO Auto-generated method stub
		return projectrepo.findAll();
	}

}