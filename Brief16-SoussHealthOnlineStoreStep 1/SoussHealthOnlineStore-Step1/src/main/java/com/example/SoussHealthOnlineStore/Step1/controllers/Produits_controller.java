package com.example.SoussHealthOnlineStore.Step1.controllers;

import java.util.List;

import com.example.SoussHealthOnlineStore.Step1.entities.Produits;
import com.example.SoussHealthOnlineStore.Step1.services.Produit_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produits")
public class Produits_controller {
	@Autowired
	Produit_service produit_service;

	@GetMapping("/{id}")
	public Produits getProduit(@PathVariable Long id) {
		Produits produits = produit_service.getById(id);
		return produits;
	}
	
	@GetMapping()
	public List<Produits> getAllProduits(){
		return produit_service.getall();
	}
	
	@PostMapping()
	public Produits InsertProduits(@RequestBody Produits produits) {
		Produits produits1 = produit_service.save(produits);
		return produits1;
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable Long id) {
		produit_service.delete(id);
	}
}
