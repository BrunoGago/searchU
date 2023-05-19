package com.fiap.searchU.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Table(name = "TB_CRIMES")
public class CrimeModel implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long crimesId;

    @Column(nullable = true)
    private String crimeDescription;

}