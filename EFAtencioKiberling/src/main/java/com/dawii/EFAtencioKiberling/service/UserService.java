package com.dawii.EFAtencioKiberling.service;

import java.util.List;

import com.dawii.EFAtencioKiberling.model.User;
import com.dawii.EFAtencioKiberling.projections.ReportUserCategoryClass;

public interface UserService {

	public List<User> read();
	public User create(User u);
	public User update(User u);
	public void delete(int id);
	
	public List<ReportUserCategoryClass> getReportUserCategoryClass();
	
	public List<ReportUserCategoryClass> getReportUserByCategory(String name);
}
