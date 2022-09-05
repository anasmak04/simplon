package com.example.springData.Repository;

import com.example.springData.models.CourseMaterial;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMRepository extends JpaRepository<CourseMaterial, Long> {

}
