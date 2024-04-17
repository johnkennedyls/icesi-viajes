package com.icesi.icesiviajes.repository;

import com.icesi.icesiviajes.domain.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Long> {
}
