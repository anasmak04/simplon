package com.example.SoussHealthOnlineStore.Step1.services;

import java.util.List;

import com.example.SoussHealthOnlineStore.Step1.entities.Categories;
import com.example.SoussHealthOnlineStore.Step1.repositories.Categorie_repositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@Service
public class Categorie_service implements ServiceDao<Categories> {
	@Autowired
	private Categorie_repositorie categorie_repositorie;

	@Override
	public List<Categories> getall() {
		return categorie_repositorie.findAll();
	}

	@Override
	public Categories getById(Long id_categorie) {
		return categorie_repositorie.findById(id_categorie)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not found"));

	}

	@Override
	public Categories save(Categories categories) {
		Categories categories1 = categorie_repositorie.save(categories);
		return categories1;
	}

	@Override
	public void update(Long id_categorie, Categories categories) {

	}

	@Override
	public void delete(Long id_categorie) {
		categorie_repositorie.deleteById(id_categorie);
	}

}
