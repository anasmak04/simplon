package com.example.SoussHealthOnlineStore.Step1.repositories;

import com.example.SoussHealthOnlineStore.Step1.entities.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Utilisateur_repositorie extends JpaRepository<Utilisateur, Long> {

}
