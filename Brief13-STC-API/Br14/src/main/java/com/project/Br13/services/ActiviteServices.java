package com.project.Br13.services;

import java.util.List;

import com.project.Br13.entity.Activite;
import com.project.Br13.entity.Admin;
import com.project.Br13.repository.ActiviteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ActiviteServices implements Services<Activite> {

	@Autowired
	ActiviteRepo activiterepo;

	@Override
	public List<Activite> getall() {
		return activiterepo.findAll();
	}

	@Override
	public Activite getById(Long id) {
		return activiterepo.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not found"));
	}

	@Override
	public Activite save(Activite activite) {
		return activiterepo.save(activite);
	}

	@Override
	public void update(Long id, Activite activite) {
		Activite activitee = activiterepo.findById(id).get();
		System.out.println(activitee.toString());

		activitee.setTitre(activite.getTitre());
		activitee.setDescriptif(activite.getDescriptif());
		activitee.setDate_debut(activite.getDate_debut());
		activitee.setDate_fin(activite.getDate_fin());
		activitee.setEtat(activite.isEtat());
		activitee.setTypeactivite(activite.getTypeactivite());
		activiterepo.save(activite);
	}

	@Override
	public void delete(Long id) {
		activiterepo.deleteById(id);
	}

}
