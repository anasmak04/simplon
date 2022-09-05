package com.example.springData;

import java.util.List;

import com.example.springData.Repository.SpringRepository;
import com.example.springData.models.Student;
import com.example.springData.models.StudentInfos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataApplicationTests {
	@Autowired
	private SpringRepository springrepo;
	
	
			
	@Test
	void createStudent() {
		var stinfos = new StudentInfos();
		stinfos.setEmail("anas11.makhloufi@gmail.com");
		stinfos.setNumber("212938345");
		var student = new Student();
		student.setFirstname("anas");
		student.setLastName("elmakhloufi");
		student.setStudentinfos(stinfos);
		springrepo.save(student);
		
	}
	
	
	@Test
	void printAllStudent() {
	List<Student> student = springrepo.findAll(); 
	System.out.println(student);
	}
	
	@Test
	void printStudentName() {
	List<Student> student = springrepo.findByfirstName("anas"); 
	System.out.println(student);
	}

}
