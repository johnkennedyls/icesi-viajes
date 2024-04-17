package com.icesi.icesiviajes.repository;

import com.icesi.icesiviajes.domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
