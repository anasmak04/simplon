package com.example.SoussHealthOnlineStore.Step1.services;

import java.util.List;

import com.example.SoussHealthOnlineStore.Step1.entities.Produit;
import com.example.SoussHealthOnlineStore.Step1.repositories.Produits_repositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class Produit_service implements ServiceDao<Produit> {
	@Autowired
	private Produits_repositorie produits_repositorie;

	@Override
	public List<Produit> getall() {
		return produits_repositorie.findAll();
	}

	@Override
	public Produit getById(Long id) {
		return produits_repositorie.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not found"));
	}

	@Override
	public Produit save(Produit produit) {
		return produits_repositorie.save(produit);
	}

	@Override
	public void update(Long id, Produit produit) {
		Produit produits1 = produits_repositorie.findById(id).get();
		produits1.setId(produit.getId());
		produits1.setName(produit.getName());
		produits1.setDescription(produit.getDescription());
		produits_repositorie.save(produits1);
	}

	@Override
	public void delete(Long id) {
		produits_repositorie.deleteById(id);
	}

}
