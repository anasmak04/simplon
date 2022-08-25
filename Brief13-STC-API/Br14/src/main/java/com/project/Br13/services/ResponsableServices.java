package com.project.Br13.services;

import java.util.List;

import com.project.Br13.entity.Responsable;
import com.project.Br13.repository.ResponsableRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ResponsableServices implements Services<Responsable> {

	@Autowired
	ResponsableRepo respRepo;

	@Override
	public List<Responsable> getall() {
		return respRepo.findAll();
	}

	@Override
	public Responsable getById(Long id_responsable) {
		return respRepo.findById(id_responsable)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not found"));

	}

	@Override
	public Responsable save(Responsable responsable) {
		return respRepo.save(responsable);
	}

	@Override
	public void update(Long id, Responsable responsable) {
		Responsable responsablee = respRepo.findById(id).get();
		System.out.println(responsablee.toString());
		responsablee.setNom(responsable.getNom());
		responsablee.setPrenom(responsable.getPrenom());
		responsablee.setTelephone(responsable.getTelephone());
		responsablee.setDomaine(responsable.getDomaine());
		responsablee.setEtat(responsable.isEtat());
		responsablee.setTyperesponsable(responsable.getTyperesponsable());
		respRepo.save(responsablee);
	}

	@Override
	public void delete(Long id_responsable) {
		respRepo.deleteById(id_responsable);
	}

}
