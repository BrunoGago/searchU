package com.fiap.searchU.services.impl;

import com.fiap.searchU.models.CrimeModel;
import com.fiap.searchU.repositories.CrimeRepository;
import com.fiap.searchU.services.CrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CrimeServiceImpl implements CrimeService {

    @Autowired
    CrimeRepository crimeRepository;


}
