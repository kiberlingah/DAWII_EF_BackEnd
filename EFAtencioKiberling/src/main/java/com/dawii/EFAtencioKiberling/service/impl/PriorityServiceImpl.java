package com.dawii.EFAtencioKiberling.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.EFAtencioKiberling.model.Priority;
import com.dawii.EFAtencioKiberling.repo.PriorityRepo;
import com.dawii.EFAtencioKiberling.service.PriorityService;

@Service
public class PriorityServiceImpl implements PriorityService {
	@Autowired
	PriorityRepo priorityrepo;
	
	@Override
	public List<Priority> list() {
		// TODO Auto-generated method stub
		return priorityrepo.findAll();
	}
	

}
