package com.example.PR11.dao;

import java.util.List;

import com.example.PR11.models.Employe;

public interface DaoInter {
	 public void save(Employe employe);    
	 public List<Employe> listAll();   
	 public Employe get(long id_employees);   
	 public void delete(long id_employees);
	    
	    
}
