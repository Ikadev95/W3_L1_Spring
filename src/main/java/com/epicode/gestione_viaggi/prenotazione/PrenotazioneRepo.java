package com.epicode.gestione_viaggi.prenotazione;

import com.epicode.gestione_viaggi.dipendente.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface PrenotazioneRepo extends JpaRepository<Prenotazione,Long> {
    @Query("SELECT COUNT(p) " +
            "FROM Prenotazione p " +
            "JOIN p.viaggio v " +
            "WHERE p.dipendente = :dipendente AND v.data = :data")
    long countPrenotazioniByDipendenteAndData(@Param("dipendente") Dipendente dipendente,
                                              @Param("data") LocalDate data);
}
