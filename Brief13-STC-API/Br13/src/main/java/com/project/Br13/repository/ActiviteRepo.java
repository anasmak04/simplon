package com.project.Br13.repository;

import com.project.Br13.entity.Activite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiviteRepo extends JpaRepository<Activite, Long> {

}
