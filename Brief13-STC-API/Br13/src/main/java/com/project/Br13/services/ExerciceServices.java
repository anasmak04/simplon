package com.project.Br13.services;

import java.util.List;
import java.util.Optional;

import com.project.Br13.entity.Exercice;
import com.project.Br13.repository.ExerciceRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
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
	public Exercice getById(Long id_exercice) {
        return exercicerepo.findById(id_exercice).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not found") );
	}

	@Override
	public Exercice save(Exercice exercice) {
		return exercicerepo.save(exercice);
	}

	@Override
	public Exercice update(Exercice exercice) {
		Optional<Exercice> exr  = exercicerepo.findById(exercice.getId_exercice());
        if(exr == null) {
            throw new RestClientException("Employee with id "+exercice.getId_exercice()+" not found");
        }
        return exercicerepo.save(exercice);
	}

	@Override
	public void delete(Long id_exercice) {
		exercicerepo.deleteById(id_exercice);
	}
}
