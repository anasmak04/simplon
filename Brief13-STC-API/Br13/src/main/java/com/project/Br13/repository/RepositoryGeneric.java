package com.project.Br13.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryGeneric <T,Integer> extends JpaRepository<T, Integer> {

}
