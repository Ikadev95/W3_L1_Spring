package com.epicode.gestione_viaggi.dipendente;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "dipendenti")
public class Dipendente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String username;
    private String nome;
    private String cognome;
    private String email;
    private String imageUrl;
}