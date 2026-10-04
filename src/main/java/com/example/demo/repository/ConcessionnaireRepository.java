package com.example.demo.repository;

import com.example.demo.model.Concessionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcessionnaireRepository extends JpaRepository<Concessionnaire, Integer> {
}