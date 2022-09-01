package com.project.Br13;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import com.project.Br13.controller.AdminController;
import com.project.Br13.entity.Admin;
import com.project.Br13.entity.Exercice;
import com.project.Br13.repository.AdminRepository;
import com.project.Br13.services.AdminServices;
import com.project.Br13.services.ExerciceServices;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Br13ApplicationTests {
	@Autowired
	private AdminRepository adminrepo;
	@Autowired
	private AdminServices adminservices;
	
	@Autowired
	private ExerciceServices exerciceservices;
//
//	@Test
//	void testCreateAdmin() {
//		Admin admin = new Admin();
//		admin.setId(8L);
//		admin.setNom("anas");
//		admin.setPrenom("mak");
//		admin.setEmail("anasbilal@google.com");
//		admin.setTelephone("2126737495");
//		admin.setPassword("anas5125N");
//		adminservices.save(admin);
//		assertNotNull(adminservices.getById(8L).getId());
//	}
//	
//	@Test
//	void testGetAllAdmin() {
//		List<Admin>list = adminservices.getall();
//		assertThat(list).size().isGreaterThan(0);
//	}
//	
//	
//	@Test
//	void testgetByIDAdmin() {
//		 adminservices.getById(8L).getId();
//	}
//	
//	@Test 
//	void TestDeleteAdmin() {
//		adminservices.delete(14L);
//	}
//	
//	@Test  
//	void TestUpdateAdmin() {
//		Admin admin = new Admin();
//		admin = adminservices.getById(13L);
//		admin.setNom("omar");
//		adminservices.update(13L, admin);
//	}
//	
	
	@Test
	void testCreateExercice() {
		Exercice exercice = new Exercice();
		exercice.setId_exercice(14L);
		 exercice.setAnnee(2022l);
		 exercice.setDate_debut(null);
		 exercice.setDate_fin(null);
		 exercice.setStatut(false); 
		exerciceservices.save(exercice);
	}
	
	
	@Test
	void testGetAllExercice() {
	List<Exercice>list = exerciceservices.getall();
	}
	
	
	@Test
	void testgetByIDAdmin() {
	 exerciceservices.getById(1L);
	}
	
	@Test 
	void TestDeleteAdmin() {
		exerciceservices.delete(3L);
	}
	
//	@Test  
//	void TestUpdateExercice() {
//		Exercice exercice = new Exercice();
//		exercice = exerciceservices.getById(3L);
//		exercice.setStatut(true);
//		exerciceservices.update(3L, exercice);
//	}
	
	
	
}
