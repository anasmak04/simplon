package net.j2ee.ecole.models;

import net.j2ee.ecole.dao.Dao;
import net.j2ee.ecole.dao.DaoEtu;
import net.j2ee.ecole.dao.DaoUser;

public class Main {

	public static void main(String[] args) {
		Dao dao = new Dao();
		DaoEtu daoe = new DaoEtu();
		DaoUser daou = new DaoUser();
//		Professeurs prof = new Professeurs("anas","bilal");
//		dao.saveProfesseurs(prof);
//		dao.deleteProfesseurs(22222222222222222222222222);
//		dao.deleteProfesseurs(2);
//		System.out.println(dao.getProfesseurs(3));
//		Etudiant etu = new Etudiant(2, "bilal","mak",  "bac", 0);
		System.out.println("start le programme");
		Admin admin = new Admin(1,"anas","anas@googl.com","aa");
//		dao.saveEtudiant(etu);
//		daoe.save(etu);
		daou.save(admin);
		System.out.println("finish le programme");
		
	}
}
