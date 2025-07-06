package com.jeison.devlog.bitacora.diario.repository;

import com.jeison.devlog.bitacora.diario.model.DiarioEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface DiarioRepository extends JpaRepository<DiarioEntry, Long> {

    List<DiarioEntry> findAllByOrderByFechaDesc();

    Optional<DiarioEntry> findByFecha(LocalDate fecha);
}
