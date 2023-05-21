package com.fiap.searchU.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.searchU.models.CrimeModel;

public interface CrimeRepository extends JpaRepository<CrimeModel, Long> {

}
