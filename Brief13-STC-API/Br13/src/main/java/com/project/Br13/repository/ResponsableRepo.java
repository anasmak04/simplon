package com.project.Br13.repository;

import com.project.Br13.entity.Responsable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableRepo extends JpaRepository<Responsable, Long> {

}
