package com.fiap.searchU.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.searchU.models.WantedPersonModel;
import com.fiap.searchU.services.WantedPersonService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/wanteds")
public class WantedPersonController {

	@Autowired
	private WantedPersonService service;
	
	@GetMapping
	public ResponseEntity<List<WantedPersonModel>> findAllPerson() {
		List<WantedPersonModel> list = service.findAllPerson();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<WantedPersonModel> findPersonById(@PathVariable Long id) {
		WantedPersonModel person = service.findPersonById(id);
		return ResponseEntity.ok().body(person);
	}
	
}
