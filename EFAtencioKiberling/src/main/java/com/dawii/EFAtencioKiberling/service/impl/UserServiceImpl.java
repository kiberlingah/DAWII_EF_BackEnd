package com.dawii.EFAtencioKiberling.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.EFAtencioKiberling.model.User;
import com.dawii.EFAtencioKiberling.projections.ReportUserCategoryClass;
import com.dawii.EFAtencioKiberling.repo.UserRepo;
import com.dawii.EFAtencioKiberling.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userrepo;
	
	@Override
	public List<User> read() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}

	@Override
	public User create(User u) {
		// TODO Auto-generated method stub
		return userrepo.save(u);
	}

	@Override
	public User update(User u) {
		// TODO Auto-generated method stub
		return userrepo.save(u);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userrepo.deleteById(id);
	}

	
	public List<ReportUserCategoryClass> getReportUserCategoryClass() {
		List<ReportUserCategoryClass> list = userrepo.getReportUserCategoryClass();
		return list;
	}

	@Override
	public List<ReportUserCategoryClass> getReportUserByCategory(String name) {
		// TODO Auto-generated method stub
		List<ReportUserCategoryClass> list = userrepo.getReportUserCategoryClass(name);
	    return list;
	}
	

}
