package net.j2ee.ecole.dao;

import net.j2ee.ecole.models.Etudiant;
import net.j2ee.ecole.models.Professeurs;

public interface DaoInter {
	  public void saveProfesseurs(Professeurs professeurs);
	  public void updateProfesseurs(Professeurs professeurs);
	  public void deleteProfesseurs(int id_Prof);
	  public Professeurs getProfesseurs(int id_Prof);
	  
	  public void saveEtudiant(Etudiant etudiant);
	  public void deleteEtudiant(int id_Etudi);
	  public Etudiant getEtudiant(int id_Etudi);

	  
	  
}
