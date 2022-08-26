package com.project.Br13.controller;

import java.util.List;

import com.project.Br13.entity.Activite;
import com.project.Br13.entity.Admin;
import com.project.Br13.entity.Exercice;
import com.project.Br13.services.ActiviteServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("activite")
public class ActiviteController {

	@Autowired
	ActiviteServices activiteservices;
	
	@GetMapping("/{id}")
	public Activite getActivite(@PathVariable Long id) {
	Activite activite = activiteservices.getById(id);
	return activite;
	}
	
	@GetMapping()
	public List<Activite> getallAdmin(){
	return activiteservices.getall();
	}			

	@PostMapping()
	public Activite InsertAdmin(@RequestBody Activite activite) {
	return activiteservices.save(activite);
	}


	@DeleteMapping("/{id}")
	public void DeleteActivite(@PathVariable Long id) {
		activiteservices.delete(id);
	}
	 
	 @PutMapping({"/{id}"})
	    public ResponseEntity<Activite> updateAdmin(@PathVariable("id") Long id, @RequestBody Activite activite) {
		 activiteservices.update(id, activite);
	        return new ResponseEntity<>(activiteservices.getById(id), HttpStatus.OK);
	    }
}
