package com.fiap.searchU.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fiap.searchU.enums.GenderType;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "TB_WANTED")
public class WantedPersonModel implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wantedPersonId;

    @Column(length = 55, nullable = false)
    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate birthdate;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender", nullable = false, unique = true, length = 1)
    private GenderType gender;

    @Column(length = 11, nullable = false)
    private String cpf;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "TB_WANTED_CRIMES",
                joinColumns = @JoinColumn(name = "wantedPersonId"),
                inverseJoinColumns = @JoinColumn(name = "crimesId"))
    private Set<CrimeModel> crimes = new HashSet<>();
}
