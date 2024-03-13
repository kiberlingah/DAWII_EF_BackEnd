package com.dawii.EFAtencioKiberling.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String title;
	private String description;
	private LocalDate updated_at;
	private LocalDate created_at;
	
	@ManyToOne
	@JoinColumn(name="kind_id",referencedColumnName = "id")
	private Kind kinds;
	
	@ManyToOne
	@JoinColumn(name="user_id",referencedColumnName = "id")
	private User users;
	
	@ManyToOne
	@JoinColumn(name="project_id",referencedColumnName = "id")
	private Project projects;
	
	@ManyToOne
	@JoinColumn(name="category_id",referencedColumnName = "id")
	private Category categories;
	
	@ManyToOne
	@JoinColumn(name="priority_id",referencedColumnName = "id")
	private Priority priorities;
	
	@ManyToOne
	@JoinColumn(name="status_id",referencedColumnName = "id")
	private Status status;
	

}
