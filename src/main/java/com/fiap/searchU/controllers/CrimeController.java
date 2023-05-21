package com.fiap.searchU.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.searchU.models.CrimeModel;
import com.fiap.searchU.services.CrimeService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/crimes")
public class CrimeController {
	
	@Autowired
	private CrimeService service;
	
	@GetMapping
	public ResponseEntity<List<CrimeModel>> findAllCrimes(){
		List<CrimeModel> list = service.findAllCrimes();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<CrimeModel> findCrimeById(@PathVariable Long id) {
		CrimeModel crime = service.findCrimeById(id);
		return ResponseEntity.ok().body(crime);
	}
}