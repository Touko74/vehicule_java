package com.example.demo.repository;

import com.example.demo.model.Velo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeloRepository extends JpaRepository<Velo, Integer> {
}
