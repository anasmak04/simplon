package dao;

import java.util.List;

import model.Employe;

public interface Dao {
	
	public List<Employe> listEmploye();
	public Employe getEmploye(String reference);
	public void addEmploye(Employe e);
	public void updateEmploye(Employe e);
	public void deleteEmploye(String reference);
	

}
