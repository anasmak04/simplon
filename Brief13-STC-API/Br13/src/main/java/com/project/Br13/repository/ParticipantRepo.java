package com.project.Br13.repository;

import com.project.Br13.entity.Participant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ParticipantRepo extends JpaRepository<Participant, Long> {

}
