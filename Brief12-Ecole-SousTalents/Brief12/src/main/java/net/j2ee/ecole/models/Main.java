package net.j2ee.ecole.models;

import java.util.ArrayList;

import net.j2ee.ecole.dao.Dao;
import net.j2ee.ecole.dao.DaoCours;
import net.j2ee.ecole.dao.DaoEtu;
import net.j2ee.ecole.dao.DaoUser;

public class Main {

	public static void main(String[] args) {
		Dao dao = new Dao(); DaoEtu daoe = new DaoEtu();
		DaoUser daou = new DaoUser();DaoCours daocours = new DaoCours();
		
		System.out.println("=============================>start le programme<=============================");
//		Professeurs professeurs = new Professeurs(1,"anas","bilal", new ArrayList<Cours>());
//		Etudiant etudiant = new Etudiant(1, "slaha eddine", "saad", "bac", 22,new ArrayList<Cours>());  
		Professeurs professeurs = dao.get(1);
		Etudiant etudiant = daoe.get(1);  
		Cours cours = new Cours();
		daocours.save(new Cours(1,"js",etudiant,professeurs));
		System.out.println("=============================>finish le programme<=============================");
}
}
