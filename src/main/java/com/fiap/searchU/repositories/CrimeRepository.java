package com.fiap.searchU.repositories;

import com.fiap.searchU.models.CrimeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrimeRepository extends JpaRepository<CrimeModel, Long> {

}
