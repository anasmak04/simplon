package com.project.Br13.services;

import java.util.List;

import com.project.Br13.entity.Activite;
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
	public Activite getById(Integer id_activite) {
        return activiterepo.findById(id_activite).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not found") );
	}

	@Override
	public Activite save(Activite activite) {
		return activiterepo.save(activite);
	}

	@Override
	public void update(Activite type) {
		
	}

	@Override
	public void delete(Integer id_activite) {
			activiterepo.deleteById(id_activite);
	}


}
