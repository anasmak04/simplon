package com.example.SoussHealthOnlineStore.Step1.repositories;

import com.example.SoussHealthOnlineStore.Step1.entities.Categorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Categorie_repositorie extends JpaRepository<Categorie, Long> {

}
