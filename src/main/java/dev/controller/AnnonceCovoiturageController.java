/**
 * 
 */
package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.entite.AnnonceCovoiturage;
import dev.repository.AnnonceCovoiturageRepository;
import dev.repository.ReservationCovoiturageRepository;
import dev.repository.VehiculePersonnelRepository;

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
	private ReservationCovoiturageRepository reservationCovoiturageRepo;
	@Autowired
	private VehiculePersonnelRepository vehiculeRepo;

	@RequestMapping(method = RequestMethod.GET, path = "/annonces")
	public List<AnnonceCovoiturage> listerAnnonces() {
		return annonceCovoitRepo.findAll();
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/annonces/creer")
	public void creerAnnonce(@RequestBody AnnonceCovoiturage annonce) {
		AnnonceCovoiturage nouvelleAnnonce = new AnnonceCovoiturage(annonce.getAdresseDepart(),
				annonce.getAdresseArrive(), annonce.getDuree(), annonce.getDistance(), annonce.getVehicule(),
				annonce.getNombrePlace(), annonce.getDate(), annonce.getAuteurAnnonce(), annonce.getReservations());
		if (vehiculeRepo.findOne(nouvelleAnnonce.getVehicule().getId()) != null
				&& annonce.getAuteurAnnonce().getMatricule() != null) {
			annonceCovoitRepo.save(nouvelleAnnonce);
		} else if (vehiculeRepo.findOne(nouvelleAnnonce.getVehicule().getId()) == null
				&& annonce.getAuteurAnnonce().getMatricule() != null) {
			vehiculeRepo.save(nouvelleAnnonce.getVehicule());
			annonceCovoitRepo.save(nouvelleAnnonce);
		}
	}

	@RequestMapping(method = RequestMethod.GET, path = "/annonces/{id}")
	public AnnonceCovoiturage detailsAnnonce(@PathVariable Integer id) {
		AnnonceCovoiturage detailAnnonce = new AnnonceCovoiturage();
		if (annonceCovoitRepo.findOne(id) != null) {
			detailAnnonce = annonceCovoitRepo.findOne(id);
		}
		return detailAnnonce;
	}

}
