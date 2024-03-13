package com.dawii.EFAtencioKiberling.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dawii.EFAtencioKiberling.model.Ticket;
import com.dawii.EFAtencioKiberling.projections.ReportUserCategoryClass;

public interface TicketRepo extends JpaRepository<Ticket,Integer> {
	
	

}
