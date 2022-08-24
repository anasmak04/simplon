package com.project.Br13.services;

import java.util.List;

import com.project.Br13.entity.TypeRespnsable;
import com.project.Br13.repository.typeresponsableReposiroty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TyperespoServices implements Services<TypeRespnsable> {
		
	@Autowired
	typeresponsableReposiroty tRrepo;
	
	@Override
	public List<TypeRespnsable> getall() {
		return tRrepo.findAll();
	}

	@Override
	public TypeRespnsable getById(Long id) {
        return tRrepo.findById(id).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not found") );

	}

	@Override
	public TypeRespnsable save(TypeRespnsable typeresponsable) {
		return tRrepo.save(typeresponsable);
	}

	@Override
	public TypeRespnsable update(TypeRespnsable type1) {
		return null;
	}

	@Override
	public void delete(Long id) {
		tRrepo.deleteById(id);		
	}

}
