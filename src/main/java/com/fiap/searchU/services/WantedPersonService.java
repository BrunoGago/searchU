package com.fiap.searchU.services;

import java.util.List;

import com.fiap.searchU.models.WantedPersonModel;

public interface WantedPersonService {

	List<WantedPersonModel> findAllPerson();

	WantedPersonModel findPersonById(Long id);


}
