package com.project.Br13.controller;

import java.util.List;
import com.project.Br13.entity.TypeRespnsable;
import com.project.Br13.services.TyperespoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("typeresponsable")
public class TyperespController {

	@Autowired
	TyperespoServices typeResservice;

	public TyperespController(TyperespoServices typeResservice) {
		super();
		this.typeResservice = typeResservice;
	}

	@GetMapping("/{id}")
	public TypeRespnsable getResponsable(@PathVariable Long id) {
		TypeRespnsable typeres = typeResservice.getById(id);
		return typeres;
	}

	@GetMapping()
	public List<TypeRespnsable> getallAdmin() {
		return typeResservice.getall();
	}

	@PostMapping()
	public TypeRespnsable InsertExercice(@RequestBody TypeRespnsable typeres) {
//		System.out.println(responsable.getFullname());
		return typeResservice.save(typeres);
	}

	@DeleteMapping("/{id}")
	public void DeleteAdmin(@PathVariable Long id) {
		typeResservice.delete(id);
	}

//	    @PutMapping()
//	    public Exercice updateExercice(@PathVariable Long id,@RequestBody Exercice exercice) {
//	        return exerciceservices.update(exercice); 
//	    }
}
