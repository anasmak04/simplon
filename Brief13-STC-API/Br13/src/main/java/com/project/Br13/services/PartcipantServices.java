package com.project.Br13.services;

import java.util.List;

import com.project.Br13.entity.Exercice;
import com.project.Br13.entity.Participant;
import com.project.Br13.repository.ParticipantRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PartcipantServices implements Services<Participant> {

	@Autowired
	ParticipantRepo partiRepository;

	@Override
	public List<Participant> getall() {
		return partiRepository.findAll();
	}

	@Override
	public Participant getById(Long id_participant) {
		return partiRepository.findById(id_participant)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource Not found"));
	}

	@Override
	public Participant save(Participant participant) {
		return partiRepository.save(participant);
	}

	@Override
	public void update(Long id, Participant participant) {
		Participant participantt = partiRepository.findById(id).get();
		System.out.println(participantt.toString());
		participantt.setFullname(participant.getFullname());
		participantt.setTelephone(participant.getTelephone());
		participantt.setEmail(participant.getEmail());
		participantt.setDomaine(participant.getDomaine());
		participantt.setStructure(participant.getStructure());
		partiRepository.save(participantt);

	}

	@Override
	public void delete(Long id_participant) {
		partiRepository.deleteById(id_participant);
	}

}
