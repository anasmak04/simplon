package com.example.springData.Repository;

import com.example.springData.models.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {

}
