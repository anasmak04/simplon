package com.project.Br13.services;

import java.util.List;

import com.project.Br13.entity.TypeActivite;
import com.project.Br13.repository.TypeActiviteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TypeActiviteServices implements Services<TypeActivite> {
		
	@Autowired
	TypeActiviteRepo typeactiviterepo;
	
	@Override
	public List<TypeActivite> getall() {
		return typeactiviterepo.findAll();
	}

	@Override
	public TypeActivite getById(Long id) {
		 typeactiviterepo.findById(id);
	        return typeactiviterepo.findById(id).orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource Not found") );

	}

	@Override
	public TypeActivite save(TypeActivite typeact) {
			return typeactiviterepo.save(typeact);
	}

	@Override
	public TypeActivite update(TypeActivite type1) {
		return null;
	}

	@Override
	public void delete(Long id) {
			 typeactiviterepo.deleteById(id);
	}

}
