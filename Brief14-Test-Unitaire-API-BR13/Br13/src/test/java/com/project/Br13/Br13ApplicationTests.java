package com.project.Br13;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import com.project.Br13.controller.AdminController;
import com.project.Br13.entity.Admin;
import com.project.Br13.repository.AdminRepository;
import com.project.Br13.services.AdminServices;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Br13ApplicationTests {
	@Autowired
	private AdminRepository adminrepo;

	@Autowired
	private AdminServices adminservices;

	@Test
	void testCreateAdmin() {
		Admin admin = new Admin();
		admin.setId(1L);
		admin.setNom("anas");
		admin.setPrenom("mak");
		admin.setEmail("anasbilal@google.com");
		admin.setTelephone("2126737495");
		admin.setPassword("anas5125N");
		adminservices.save(admin);
		assertNotNull(adminservices.getById(1L).getId());
	}
	
	@Test
	void testGetAllAdmin() {
		List<Admin>list = adminservices.getall();
		assertThat(list).size().isGreaterThan(0);
	}
	
	

}
