package com.example.SoussHealthOnlineStore.Step1.repositories;

import com.example.SoussHealthOnlineStore.Step1.entities.Produit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Produits_repositorie extends JpaRepository<Produit, Long> {

}
