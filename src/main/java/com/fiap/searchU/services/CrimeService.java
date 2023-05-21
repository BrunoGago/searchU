package com.fiap.searchU.services;

import java.util.List;

import com.fiap.searchU.models.CrimeModel;

public interface CrimeService {

	List<CrimeModel> findAllCrimes();

	CrimeModel findCrimeById(Long id);



}