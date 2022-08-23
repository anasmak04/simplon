package com.project.Br13.controller;

import java.util.List;

import com.project.Br13.entity.Responsable;
import com.project.Br13.entity.TypeActivite;
import com.project.Br13.services.TypeActiviteServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("typeactivite")
public class TypeActiviteController {
	
	@Autowired
	TypeActiviteServices typeAServ;

	public TypeActiviteController(TypeActiviteServices typeAServ) {
		super();
		this.typeAServ = typeAServ;
	}
	
	@GetMapping("/{id}")
	public TypeActivite getResponsable(@PathVariable Long id) {
		TypeActivite typeact = typeAServ.getById(id);
		return typeact;
	} 
	
	@GetMapping()
	public List<TypeActivite> getallAdmin(){
	return typeAServ.getall();
	}			

	@PostMapping()
	public TypeActivite InsertExercice(@RequestBody TypeActivite typeact) {
//		System.out.println(responsable.getFullname());
	return typeAServ.save(typeact);
	}


	@DeleteMapping("/{id}")
	public void DeleteAdmin(@PathVariable Long id) {
		typeAServ.delete(id);
	}
	
	
	     
//	    @PutMapping()
//	    public Exercice updateExercice(@PathVariable Long id,@RequestBody Exercice exercice) {
//	        return exerciceservices.update(exercice); 
//	    }
	
}
