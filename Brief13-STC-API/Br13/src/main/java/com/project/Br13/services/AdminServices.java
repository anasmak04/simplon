package com.project.Br13.services;

import java.util.List;

import com.project.Br13.entity.Admin;
import com.project.Br13.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AdminServices {
	@Autowired
	AdminRepository adminrepo;
	
	
	    public List<Admin> getAllAdmin() {
	    	return adminrepo.findAll();	
	    	}

	    public Admin getAdminById(Integer id) {
	        return adminrepo.findById(id).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not found") );
	    }

	    public Admin createAdmin(Admin admin) {
	        return adminrepo.save(admin);
	    }

	    public void DeleteAdmin(Integer id) {
	    	 adminrepo.deleteById(id);
	    }
	    	
//	    public Admin updateEmployee(Admin admin) {
//	        Admin admin = adminrepo
//	    }
	      


	
}
