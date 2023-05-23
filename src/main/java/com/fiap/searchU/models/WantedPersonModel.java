package com.fiap.searchU.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fiap.searchU.enums.GenderType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_WANTED")
public class WantedPersonModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wantedPersonId;

    @Column(length = 55, nullable = false)
    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate birthdate;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private GenderType gender;

    @Column(length = 11, nullable = false)
    private String cpf;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "TB_WANTED_CRIMES",
                joinColumns = @JoinColumn(name = "wantedPersonId"),
                inverseJoinColumns = @JoinColumn(name = "crimesId"))
    private Set<CrimeModel> crimes = new HashSet<>();
}
