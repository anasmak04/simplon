package com.project.Br13.controller;

import java.util.List;

import com.project.Br13.entity.Admin;
import com.project.Br13.entity.Exercice;
import com.project.Br13.services.AdminServices;
import com.project.Br13.services.ExerciceServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class ExerciceController { 
	@Autowired 
	ExerciceServices exerciceservices;  


	@GetMapping("/{id}")
	public Exercice getExercice(@PathVariable Integer id) {
	Exercice exercice = exerciceservices.getById(id);
	return exercice;
	}
	
	@GetMapping()
	public List<Exercice> getallAdmin(){
	return exerciceservices.getall();
	}			

	@PostMapping()
	public Exercice InsertAdmin(@RequestBody Exercice exercice) {
	return exerciceservices.save(exercice);
	}


	@DeleteMapping("/{id}")
	public void DeleteAdmin(@PathVariable Integer id) {
		exerciceservices.delete(id);
	}
	
	}
