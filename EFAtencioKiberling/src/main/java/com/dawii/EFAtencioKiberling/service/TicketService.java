package com.dawii.EFAtencioKiberling.service;

import java.util.List;

import com.dawii.EFAtencioKiberling.model.Ticket;
import com.dawii.EFAtencioKiberling.projections.ReportUserCategoryClass;

public interface TicketService {
		
	public List<Ticket> read();
	public Ticket create(Ticket t);
	public Ticket update(Ticket t);
	public void delete(int id);
}
