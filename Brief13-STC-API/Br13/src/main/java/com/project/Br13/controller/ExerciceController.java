package com.project.Br13.controller;

import java.util.List;

import com.project.Br13.entity.Activite;
import com.project.Br13.entity.Admin;
import com.project.Br13.entity.Exercice;
import com.project.Br13.services.AdminServices;
import com.project.Br13.services.ExerciceServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
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
@RequestMapping("exercice")
public class ExerciceController {
	@Autowired
	ExerciceServices exerciceservices;

	public ExerciceController(ExerciceServices exerciceservices) {
		super();
		this.exerciceservices = exerciceservices;
	}

	@GetMapping("/{id}")
	public Exercice getExercice(@PathVariable Long id) {
		Exercice exercice = exerciceservices.getById(id);
		return exercice;
	}

	@GetMapping()
	public List<Exercice> getallAdmin() {
		return exerciceservices.getall();
	}

	@PostMapping()
	public Exercice InsertExercice(@RequestBody Exercice exercice) {

		System.out.println(exercice.getAnnee());
		return exerciceservices.save(exercice);
	}

	@DeleteMapping("/{id}")
	public void DeleteAdmin(@PathVariable Long id) {
		exerciceservices.delete(id);

	}

	@PutMapping({"/{id}"})
	    public ResponseEntity<Exercice> updateAdmin(@PathVariable("id") Long id, @RequestBody Exercice exercice) {
		 exerciceservices.update(id, exercice);
	        return new ResponseEntity<>(exerciceservices.getById(id), HttpStatus.OK);
	    }

}
