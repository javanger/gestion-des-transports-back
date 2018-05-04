package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(method = RequestMethod.POST, path = "/vehiculePersonnel/creer")
	public void submitForm(@RequestBody VehiculePersonnel vehiculePersonnel) {
		VehiculePersonnel nouveauVehiuculePersonnel = new VehiculePersonnel(vehiculePersonnel.getImmatriculation(),
				vehiculePersonnel.getMarque(), vehiculePersonnel.getModele(), vehiculePersonnel.getNbPlaces());
		if (vehiculePersonnelRepository.findById(nouveauVehiuculePersonnel.getId()) == null)
			vehiculePersonnelRepository.save(vehiculePersonnel);
	}

}
