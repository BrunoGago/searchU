package com.fiap.searchU.services.impl;

import java.util.List;

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
		List<CrimeModel> list = crimeRepository.findAll();
		return list;
	}

	@SuppressWarnings("deprecation")
	@Override
	public CrimeModel findCrimeById(Long id) {
		CrimeModel crime = crimeRepository.getById(id);
		return crime;
	}
}
