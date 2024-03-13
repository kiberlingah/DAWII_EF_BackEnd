package com.dawii.EFAtencioKiberling.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawii.EFAtencioKiberling.model.Ticket;
import com.dawii.EFAtencioKiberling.projections.ReportUserCategoryClass;
import com.dawii.EFAtencioKiberling.repo.TicketRepo;
import com.dawii.EFAtencioKiberling.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepo ticketrepo;

	@Override
	public List<Ticket> read() {
		// TODO Auto-generated method stub
		return ticketrepo.findAll();
	}

	@Override
	public Ticket create(Ticket t) {
		// TODO Auto-generated method stub
		return ticketrepo.save(t);
	}

	@Override
	public Ticket update(Ticket t) {
		// TODO Auto-generated method stub
		return ticketrepo.save(t);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		ticketrepo.deleteById(id);
		
	}
	
	
}
