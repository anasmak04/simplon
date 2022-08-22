package com.project.Br13.services;

import java.util.List;

import com.project.Br13.entity.Exercice;
import com.project.Br13.repository.ExerciceRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ExerciceServices implements Services<Exercice>  {
			
	@Autowired
	ExerciceRepo exercicerepo;
	
	@Override
	public List<Exercice> getall() {
		return exercicerepo.findAll();
	}

	@Override
	public Exercice getById(Integer id) {
        return exercicerepo.findById(id).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not found") );
	}

	@Override
	public Exercice save(Exercice exercice) {
		return exercicerepo.save(exercice);
	}

	@Override
	public void update(Exercice exercice) {
		
	}

	@Override
	public void delete(Integer id) {
		exercicerepo.deleteById(id);
	}
}
