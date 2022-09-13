package com.example.SoussHealthOnlineStore.Step1.controllers;

import java.util.List;

import com.example.SoussHealthOnlineStore.Step1.entities.Utilisateur;
import com.example.SoussHealthOnlineStore.Step1.services.Utilisateur_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("utilisateur")
public class Utlisateur_controller {
	@Autowired
	Utilisateur_service utilisateur_service;

	@GetMapping()
	public List<Utilisateur> getUser() {
		return utilisateur_service.getall();
	}

	@GetMapping("/{id}")
	public Utilisateur getUserId(@PathVariable Long id) {
		return utilisateur_service.getById(id);
	}

	@PostMapping()
	public Utilisateur saveUser(@RequestBody Utilisateur utilisateur) {
		return utilisateur_service.save(utilisateur);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		utilisateur_service.delete(id);
	}
}
