package com.fiap.searchU.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fiap.searchU.models.CrimeModel;
import com.fiap.searchU.repositories.CrimeRepository;
import com.fiap.searchU.services.CrimeService;

@Service
public class CrimeServiceImpl implements CrimeService {

    @Autowired
    CrimeRepository crimeRepository;

	@Override
	@Transactional
	public List<CrimeModel> findAllCrimes() {
		return crimeRepository.findAll();
	}

	@Override
	public Optional<CrimeModel> findCrimeById(Long id) {
		Optional<CrimeModel> crime = crimeRepository.findById(id);
		return crime;
	}
}
