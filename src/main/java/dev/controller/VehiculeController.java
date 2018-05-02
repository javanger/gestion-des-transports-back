package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.entite.Vehicule;
import dev.repository.VehiculeRepository;

@RestController
@CrossOrigin
@RequestMapping("/vehicules")
public class VehiculeController {

	@Autowired
	private VehiculeRepository vehiculeRepository;

	@GetMapping
	public List<Vehicule> listerVehicules() {
		return this.vehiculeRepository.findAll();
	}

	@PostMapping("/ajouter")
	public Vehicule ajoutVehicule(@RequestBody Vehicule vehicule) {
		Vehicule v = new Vehicule();
		v.setImmatriculation(vehicule.getImmatriculation());
		v.setMarque(vehicule.getMarque());
		v.setModele(vehicule.getModele());
		v.setNbPlaces(vehicule.getNbPlaces());
		v.setCategorie(vehicule.getCategorie());
		v.setUrlPhoto(vehicule.getUrlPhoto());
		vehiculeRepository.save(v);

		return v;

	}

}
