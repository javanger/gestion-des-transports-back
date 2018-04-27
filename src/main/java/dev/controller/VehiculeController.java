package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.gtb.entite.Vehicule;
import dev.gtb.repository.VehiculeRepository;

@CrossOrigin
@RestController
@RequestMapping("/vehicules")
public class VehiculeController {

	@Autowired
	private VehiculeRepository vehiculeRepository;

	@GetMapping
	public List<Vehicule> listerCollegues() {
		return this.vehiculeRepository.findAll();
	}

}
