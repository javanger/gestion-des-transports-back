package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.entite.Vehicule;
import dev.repository.VehiculeRepository;

@CrossOrigin
@RestController
@RequestMapping("/vehicules")
public class VehiculeController {

	@Autowired
	private VehiculeRepository vehiculeRepository;

	@GetMapping
	public List<Vehicule> listerVehicules() {
		return this.vehiculeRepository.findAll();
	}

	@RequestMapping(value = "/{immatriculation}", method = RequestMethod.GET)
	public Vehicule find(@PathVariable String immatriculation) {
		return vehiculeRepository.findVehiculeByImmatriculation(immatriculation);
	}

}
