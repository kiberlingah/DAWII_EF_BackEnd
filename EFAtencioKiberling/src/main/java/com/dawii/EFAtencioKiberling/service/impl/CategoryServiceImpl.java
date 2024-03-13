package com.dawii.EFAtencioKiberling.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.EFAtencioKiberling.model.Category;
import com.dawii.EFAtencioKiberling.repo.CategoryRepo;
import com.dawii.EFAtencioKiberling.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryRepo categoryrepo;
	
	@Override
	public List<Category> listcat() {
		// TODO Auto-generated method stub
		return categoryrepo.findAll();
	}

}
