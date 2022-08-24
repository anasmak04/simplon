package com.project.Br13.controller;

import java.util.List;

import com.project.Br13.entity.Participant;
import com.project.Br13.entity.Responsable;
import com.project.Br13.services.ResponsableServices;

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
@RequestMapping("responsable")
public class ResponsableController {

	@Autowired
	ResponsableServices respServices;

	public ResponsableController(ResponsableServices respServices) {
		super();
		this.respServices = respServices;
	}

	@GetMapping("/{id}")
	public Responsable getResponsable(@PathVariable Long id) {
		Responsable responsable = respServices.getById(id);
		return responsable;
	}

	@GetMapping()
	public List<Responsable> getallAdmin() {
		return respServices.getall();
	}

	@PostMapping()
	public Responsable InsertExercice(@RequestBody Responsable responsable) {
//		System.out.println(responsable.getFullname());
		return respServices.save(responsable);
	}

	@DeleteMapping("/{id}")
	public void DeleteAdmin(@PathVariable Long id) {
		respServices.delete(id);
	}

	@PutMapping({ "/{id}" })
	public ResponseEntity<Responsable> updateAdmin(@PathVariable("id") Long id, @RequestBody Responsable responsable) {
		respServices.update(id, responsable);
		return new ResponseEntity<>(respServices.getById(id), HttpStatus.OK);
	}

}
