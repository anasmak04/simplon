package com.project.Br13.services;

import java.util.List;

import com.project.Br13.entity.Admin;
import com.project.Br13.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AdminServices implements Services<Admin> {
		@Autowired
		AdminRepository adminrepo;

		@Override
		public List<Admin> getall() {
			return adminrepo.findAll();	
		}

		@Override
		public Admin getById(Integer id) {
	        return adminrepo.findById(id).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not found") );

		}

		@Override
		public Admin save(Admin admin) {
	        return adminrepo.save(admin);
			
		}

		@Override
		public void update(Admin type) {
				
		}

		@Override
		public void delete(Integer id) {
			 adminrepo.deleteById(id);			
		}
	
		
}