package com.fiap.searchU.services.impl;

import com.fiap.searchU.models.WantedPersonModel;
import com.fiap.searchU.repositories.WantedPersonRepository;
import com.fiap.searchU.services.WantedPersonService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WantedPersonServiceImpl implements WantedPersonService {

    @Autowired
    WantedPersonRepository wantedPersonRepository;

	@Override
	public List<WantedPersonModel> findAllPerson() {
		List<WantedPersonModel> list = wantedPersonRepository.findAll();
		return list;
	}

	@Override
	public WantedPersonModel findPersonById(Long id) {
		@SuppressWarnings("deprecation")
		WantedPersonModel person = wantedPersonRepository.getById(id);
		return person;
	}
	
	
}
