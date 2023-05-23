package com.fiap.searchU.services;

import java.util.List;
import java.util.Optional;

import com.fiap.searchU.models.CrimeModel;

public interface CrimeService {

	List<CrimeModel> findAllCrimes();

	Optional<CrimeModel> findCrimeById(Long id);
}