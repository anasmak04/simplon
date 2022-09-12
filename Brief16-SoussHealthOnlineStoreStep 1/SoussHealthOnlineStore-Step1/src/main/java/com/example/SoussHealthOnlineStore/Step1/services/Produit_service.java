package com.example.SoussHealthOnlineStore.Step1.services;

import java.util.List;

import com.example.SoussHealthOnlineStore.Step1.entities.Produits;
import com.example.SoussHealthOnlineStore.Step1.repositories.Produits_repositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class Produit_service implements ServiceDao<Produits> {
	@Autowired
	private Produits_repositorie produits_repositorie;

	@Override
	public List<Produits> getall() {
		return produits_repositorie.findAll();
	}

	@Override
	public Produits getById(Long id) {
		return produits_repositorie.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not found"));
	}

	@Override
	public Produits save(Produits produits) {
		return produits_repositorie.save(produits);
	}

	@Override
	public void update(Long id, Produits produits) {
		Produits produits1 = produits_repositorie.findById(id).get();
		produits1.setId(produits.getId());
		produits1.setName(produits.getName());
		produits1.setDescription(produits.getDescription());
		produits_repositorie.save(produits1);
	}

	@Override
	public void delete(Long id) {
		produits_repositorie.deleteById(id);
	}

}
