package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.VehiculePersonnel;

public interface VehiculePersonnelRepository extends JpaRepository<VehiculePersonnel, Integer> {
	VehiculePersonnel findVehiculeByImmatriculation(String immatriculation);

	VehiculePersonnel findById(Integer id);
}
