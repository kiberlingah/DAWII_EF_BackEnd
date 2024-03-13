package com.dawii.EFAtencioKiberling.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dawii.EFAtencioKiberling.model.User;
import com.dawii.EFAtencioKiberling.projections.ReportUserCategoryClass;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	@Query("SELECT new com.dawii.EFAtencioKiberling.projections.ReportUserCategoryClass("
			+ "u.id AS userId, " 
	        + "u.name, " 
	        + "u.lastname, " 
	        + "c.id AS categoryId, " 
	        + "c.name AS categoryName ) "
	        +"FROM Ticket t "
	        +"INNER JOIN t.users u "
	        +"INNER JOIN t.categories c")
	public List<ReportUserCategoryClass> getReportUserCategoryClass();
	
	@Query("SELECT new com.dawii.EFAtencioKiberling.projections.ReportUserCategoryClass("
			+ "u.id AS userId, " 
	        + "u.name, " 
	        + "u.lastname, " 
	        + "c.id AS categoryId, " 
	        + "c.name ) "
	        +"FROM Ticket t "
	        +"INNER JOIN t.users u "
	        +"INNER JOIN t.categories c "
	        + "WHERE c.name = :name ")
	public List<ReportUserCategoryClass> getReportUserCategoryClass(@Param("name") String name);
	
}
