package com.project.Br13.controller;

import java.util.List;

import com.project.Br13.entity.Admin;
import com.project.Br13.repository.AdminRepository;
import com.project.Br13.services.AdminServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {
	@Autowired
	AdminServices adminservices;

	@GetMapping("/{id}")
	public Admin getAdmin(@PathVariable Long id) {
		Admin admin = adminservices.getById(id);
		return admin;
	}

	@GetMapping()
//    @PreAuthorize("hasRole('COURSE_READ')")
	public List<Admin> getallAdmin() {
		return adminservices.getall();
	}

	@PostMapping()
//	PreAuthorize()
	public Admin InsertAdmin(@RequestBody Admin admin) {
		return adminservices.save(admin);
	}

	@DeleteMapping("/{id}")
//	PreAuthorize()
	public void DeleteAdmin(@PathVariable Long id) {
		adminservices.delete(id);
	}

	@PutMapping({ "/{id}" })
//	PreAuthorize()
	public ResponseEntity<Admin> updateAdmin(@PathVariable("id") Long id, @RequestBody Admin admin) {
		adminservices.update(id, admin);
		return new ResponseEntity<>(adminservices.getById(id), HttpStatus.OK);
	}

}
