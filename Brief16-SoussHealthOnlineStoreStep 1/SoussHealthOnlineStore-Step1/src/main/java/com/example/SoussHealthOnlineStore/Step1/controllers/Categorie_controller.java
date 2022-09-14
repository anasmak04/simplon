package com.example.SoussHealthOnlineStore.Step1.controllers;

import java.util.List;

import com.example.SoussHealthOnlineStore.Step1.entities.Categorie;
import com.example.SoussHealthOnlineStore.Step1.entities.Produit;
import com.example.SoussHealthOnlineStore.Step1.services.Categorie_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
@RequestMapping("categories")
public class Categorie_controller {

	@Autowired
	private Categorie_service categorie_service;

	@GetMapping("/{id_categorie}")
	public Categorie getCategorieId(@PathVariable Long id_categorie) {
		Categorie categorie = categorie_service.getById(id_categorie);
		return categorie;
	}

	@GetMapping()
	public List<Categorie> getAllCategories() {
		return categorie_service.getall();
	}

	@PostMapping(consumes = { "*/*" })
	public Categorie InsertCategorie(@RequestBody Categorie categorie) {
		Categorie categorie1 = categorie_service.save(categorie);
		return categorie1;
	}

	@DeleteMapping("/{id_categorie}")
	public void delete(@PathVariable Long id_categorie) {
		categorie_service.delete(id_categorie);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Categorie> UpdateProduit(@PathVariable("id_categorie") Long id_categorie,
			@RequestBody Categorie categorie) {
		categorie_service.update(id_categorie, categorie);
		return new ResponseEntity<>(categorie_service.getById(id_categorie), HttpStatus.OK);
	}

}
