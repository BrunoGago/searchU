package com.fiap.searchU.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "TB_CRIMES")
public class CrimeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long crimesId;

    @Column(nullable = true)
    private String crimeDescription;

}