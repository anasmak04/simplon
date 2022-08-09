package net.j2ee.ecole.models;

import net.j2ee.ecole.dao.Dao;

public class Main {

	public static void main(String[] args) {
		Dao dao = new Dao();
//		Professeurs prof = new Professeurs("anas","bilal");
//		dao.saveProfesseurs(prof);
//		dao.deleteProfesseurs(22222222222222222222222222);
//		dao.deleteProfesseurs(2);
//		System.out.println(dao.getProfesseurs(3));
		System.out.println("finifsh programme");
		Etudiant etu = new Etudiant(1, "bilal","mak",  "bac", 0);
		dao.saveEtudiant(etu);
		
	}
}
