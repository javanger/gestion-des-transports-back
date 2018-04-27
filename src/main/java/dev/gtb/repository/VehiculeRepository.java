package dev.gtb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.gtb.entite.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Integer> {

}
