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
        return respRepo.findById(id_responsable).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not found") );

	}

	@Override
	public Responsable save(Responsable responsable) {
		return respRepo.save(responsable);
	}

	@Override
	public Responsable update(Responsable responsable) {
		return responsable;

	}

	@Override
	public void delete(Long id_responsable) {
		 respRepo.deleteById(id_responsable);
	}

}
