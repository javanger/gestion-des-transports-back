package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.entite.Vehicule;
import dev.entite.VehiculeSociete;
import dev.repository.VehiculeSocieteRepository;

@RestController
@CrossOrigin
@RequestMapping("/vehicules")
public class VehiculeSocieteController {

	@Autowired
	private VehiculeSocieteRepository vehiculeSocieteRepository;

	@GetMapping
	public List<VehiculeSociete> listerVehicules() {
		return this.vehiculeSocieteRepository.findAll();
	}

	@RequestMapping(value = "/{immatriculation}", method = RequestMethod.GET)
	public Vehicule find(@PathVariable String immatriculation) {
		return vehiculeSocieteRepository.findVehiculeByImmatriculation(immatriculation);
	}

	@PostMapping("/ajouter")
	public VehiculeSociete ajoutVehicule(@RequestBody VehiculeSociete vehicule) {
		VehiculeSociete v = new VehiculeSociete();
		v.setImmatriculation(vehicule.getImmatriculation());
		v.setMarque(vehicule.getMarque());
		v.setModele(vehicule.getModele());
		v.setNbPlaces(vehicule.getNbPlaces());
		v.setCategorie(vehicule.getCategorie());
		v.setUrlPhoto(vehicule.getUrlPhoto());
		vehiculeSocieteRepository.save(v);

		return v;

	}

}
