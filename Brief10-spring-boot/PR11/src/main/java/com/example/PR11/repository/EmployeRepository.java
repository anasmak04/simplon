package com.example.PR11.repository;

import com.example.PR11.models.Employe;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
