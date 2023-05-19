package com.fiap.searchU.services.impl;

import com.fiap.searchU.repositories.WantedPersonRepository;
import com.fiap.searchU.services.WantedPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WantedPersonServiceImpl implements WantedPersonService {

    @Autowired
    WantedPersonRepository wantedPersonRepository;

}
