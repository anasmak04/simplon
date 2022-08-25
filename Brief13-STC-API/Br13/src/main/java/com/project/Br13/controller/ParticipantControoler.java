package com.project.Br13.controller;

import java.util.List;

import com.project.Br13.entity.Exercice;
import com.project.Br13.entity.Participant;
import com.project.Br13.services.PartcipantServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("participant")
public class ParticipantControoler {
	@Autowired
	PartcipantServices partservices;

	public ParticipantControoler(PartcipantServices partservices) {
		super();
		this.partservices = partservices;
	}

	@GetMapping("/{id}")
	public Participant getExercice(@PathVariable Long id) {
		Participant participant = partservices.getById(id);
		return participant;
	}

	@GetMapping()
	public List<Participant> getallAdmin() {
		return partservices.getall();
	}

	@PostMapping()
	public Participant InsertExercice(@RequestBody Participant participant) {

		System.out.println(participant.getFullname());
		return partservices.save(participant);
	}

	@DeleteMapping("/{id}")
	public void DeleteAdmin(@PathVariable Long id) {
		partservices.delete(id);

	}

	@PutMapping({ "/{id}" })
	public ResponseEntity<Participant> updateAdmin(@PathVariable("id") Long id, @RequestBody Participant participant) {
		partservices.update(id, participant);
		return new ResponseEntity<>(partservices.getById(id), HttpStatus.OK);
	}

}
