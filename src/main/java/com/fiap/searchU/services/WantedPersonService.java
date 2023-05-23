package com.fiap.searchU.services;

import java.util.List;
import java.util.Optional;

import com.fiap.searchU.models.WantedPersonModel;

public interface WantedPersonService {

	List<WantedPersonModel> findAllPerson();

	Optional<WantedPersonModel> findPersonById(Long id);


}
