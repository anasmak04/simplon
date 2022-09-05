package com.example.springData.Repository;

import java.util.List;

import com.example.springData.models.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringRepository extends JpaRepository<Student, Long> {
	
	public List<Student> findByfirstName(String Firstname);
}
