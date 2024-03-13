package com.dawii.EFAtencioKiberling.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.EFAtencioKiberling.model.Kind;
import com.dawii.EFAtencioKiberling.repo.KindRepo;
import com.dawii.EFAtencioKiberling.service.KindService;

@Service
public class KindServiceImpl implements KindService{
	
	@Autowired
	KindRepo kindrepo;
	
	@Override
	public List<Kind> list() {
		// TODO Auto-generated method stub
		return kindrepo.findAll();
	}

}
