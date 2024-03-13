package com.dawii.EFAtencioKiberling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dawii.EFAtencioKiberling.model.User;
import com.dawii.EFAtencioKiberling.projections.ReportUserCategoryClass;
import com.dawii.EFAtencioKiberling.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200"})
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> list(){
		return  new ResponseEntity<>(userService.read(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<User> add(@RequestBody User u) {
		return new ResponseEntity<>(userService.create(u), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<User> update(@RequestBody User u) {
		return new ResponseEntity<>(userService.update(u), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		userService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	//report
	@GetMapping("/report-user-category")
	public ResponseEntity<List<ReportUserCategoryClass>> getReportClass(){
		return  new ResponseEntity<>(userService.getReportUserCategoryClass(), HttpStatus.OK)  ;
	}
	
	@GetMapping("/report-user-by-category")
	public List<ReportUserCategoryClass> getReportUserBycategory(String name) {
		List<ReportUserCategoryClass> list = userService.getReportUserByCategory(name);
	    return list;
	}

}




	
	
