/**
 * 
 */
package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.gtb.entite.AnnonceCovoiturage;
import dev.gtb.repository.VehiculeRepository;
import dev.repository.AnnonceCovoiturageRepository;
import dev.repository.ReservationRepository;

/**
 * @author GOBERT Guillaume
 *
 */
@RestController
@CrossOrigin
public class AnnonceCovoiturageController {

	@Autowired
	private AnnonceCovoiturageRepository annonceCovoitRepo;
	@Autowired
	private ReservationRepository reservationRepo;
	@Autowired
	private VehiculeRepository vehiculeRepo;

	@RequestMapping(method = RequestMethod.GET, path = "/annonces")
	public List<AnnonceCovoiturage> listerAnnonces() {
		return annonceCovoitRepo.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/annonce/creer")
	public void creerAnnonce(@RequestBody AnnonceCovoiturage annonce) {
		AnnonceCovoiturage nouvelleAnnonce = new AnnonceCovoiturage(annonce.getAdresseDepart(),
				annonce.getAdresseArrive(), annonce.getDuree(), annonce.getDistance(), annonce.getVehicule(),
				annonce.getNombrePlace(), annonce.getDate(), annonce.getAuteurAnnonce(), annonce.getReservations());
		if (vehiculeRepo.findOne(nouvelleAnnonce.getVehicule().getId()) != null) {
			annonceCovoitRepo.save(nouvelleAnnonce);
		}
	}
}