package com.jeison.devlog.bitacora.objetivos.repository;

import com.jeison.devlog.bitacora.objetivos.model.ObjetivosEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ObjetivosRepository extends JpaRepository<ObjetivosEntry, Long> {
    Optional<ObjetivosEntry> findByTitulo(String titulo);
}
