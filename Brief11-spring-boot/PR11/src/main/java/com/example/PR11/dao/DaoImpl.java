package com.example.PR11.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.example.PR11.models.Employe;
import com.example.PR11.repository.EmployeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class DaoImpl implements DaoInter {
		
	@Autowired
	private EmployeRepository emprepo;
	
	@Override
	public void save(Employe employe) {
		emprepo.save(employe);
	}

	@Override
	public List<Employe> listAll() {
		return emprepo.findAll();
	}

	@Override
	public Employe get(long id_employees) {
		return emprepo.findById(id_employees).get();
	}

	@Override
	public void delete(long id_employees) {
		emprepo.deleteById(id_employees);
	}

}
