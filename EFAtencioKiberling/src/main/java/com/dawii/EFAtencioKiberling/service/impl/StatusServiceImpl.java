package com.dawii.EFAtencioKiberling.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.EFAtencioKiberling.model.Status;
import com.dawii.EFAtencioKiberling.repo.StatusRepo;
import com.dawii.EFAtencioKiberling.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService{

	@Autowired
	StatusRepo statusrepo;
	
	@Override
	public List<Status> list() {
		// TODO Auto-generated method stub
		return statusrepo.findAll();
	}

}
