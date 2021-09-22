package com.example.Cbm2_0.repository;

import com.example.Cbm2_0.model.Gruppe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GruppeRepository extends JpaRepository<Gruppe, Long> {
}
