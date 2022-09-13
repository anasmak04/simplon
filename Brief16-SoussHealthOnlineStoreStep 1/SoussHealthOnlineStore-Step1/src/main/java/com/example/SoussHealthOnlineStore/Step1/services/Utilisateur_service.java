package com.example.SoussHealthOnlineStore.Step1.services;

import java.util.List;

import com.example.SoussHealthOnlineStore.Step1.entities.Utilisateur;
import com.example.SoussHealthOnlineStore.Step1.repositories.Utilisateur_repositorie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class Utilisateur_service implements ServiceDao<Utilisateur> {
	@Autowired
	private Utilisateur_repositorie utilisateur_repositorie;

	@Override
	public List<Utilisateur> getall() {
		return utilisateur_repositorie.findAll();
	}

	@Override
	public Utilisateur getById(Long id) {
		return utilisateur_repositorie.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not found"));
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		Utilisateur utilisateur1 = utilisateur_repositorie.save(utilisateur);
		return utilisateur1;
	}

	@Override
	public void update(Long id, Utilisateur utilisateur) {
		Utilisateur utilisateur1 = utilisateur_repositorie.findById(id).get();
		utilisateur1.setId(utilisateur.getId());
		utilisateur1.setName(utilisateur.getName());
		utilisateur1.setUsername(utilisateur.getUsername());
		utilisateur1.setPassword(utilisateur.getPassword());
		utilisateur_repositorie.save(utilisateur1);
	}

	@Override
	public void delete(Long id) {
		utilisateur_repositorie.deleteById(id);
	}

}
