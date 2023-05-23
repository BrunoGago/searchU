package com.fiap.searchU.services.impl;

import com.fiap.searchU.models.WantedPersonModel;
import com.fiap.searchU.repositories.WantedPersonRepository;
import com.fiap.searchU.services.WantedPersonService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WantedPersonServiceImpl implements WantedPersonService {

    @Autowired
    WantedPersonRepository wantedPersonRepository;

	@Override
	public List<WantedPersonModel> findAllPerson() {
		return wantedPersonRepository.findAll();
	}

	@Override
	public Optional<WantedPersonModel> findPersonById(Long id) {
		Optional<WantedPersonModel> person = wantedPersonRepository.findById(id);
		return person;
	}
	
	
}
