package com.fiap.searchU.repositories;

import com.fiap.searchU.models.WantedPersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WantedPersonRepository extends JpaRepository<WantedPersonModel, Long> {

}
