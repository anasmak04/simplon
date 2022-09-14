package com.example.SoussHealthOnlineStore.Step1.controllers;

import java.util.List;

import com.example.SoussHealthOnlineStore.Step1.entities.Produit;
import com.example.SoussHealthOnlineStore.Step1.services.Produit_service;

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
@RequestMapping("produits")
public class Produits_controller {
	@Autowired
	Produit_service produit_service;

	@GetMapping("/{id}")
	public Produit getProduit(@PathVariable Long id) {
		Produit produit = produit_service.getById(id);
		return produit;
	}
	
	@GetMapping()
	public List<Produit> getAllProduits(){
		return produit_service.getall();
	}
	
	@PostMapping()
	public Produit InsertProduits(@RequestBody Produit produit) {
		Produit produits1 = produit_service.save(produit);
		return produits1;
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable Long id) {
		produit_service.delete(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Produit> UpdateProduit(@PathVariable("id") Long id, @RequestBody Produit produit) {
		produit_service.update(id, produit);
		return new ResponseEntity<>(produit_service.getById(id), HttpStatus.OK);
	}
}
