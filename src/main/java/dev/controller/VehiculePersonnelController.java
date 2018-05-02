package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entite.VehiculePersonnel;
import dev.repository.VehiculePersonnelRepository;

@CrossOrigin
@RestController
public class VehiculePersonnelController {

	@Autowired
	private VehiculePersonnelRepository vehiculePersonnelRepository;

	@GetMapping
	public List<VehiculePersonnel> listerVehicules() {
		return this.vehiculePersonnelRepository.findAll();
	}

}
