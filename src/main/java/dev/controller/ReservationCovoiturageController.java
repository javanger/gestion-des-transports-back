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

import dev.entite.ReservationCovoiturage;
import dev.repository.AnnonceCovoiturageRepository;
import dev.repository.CollaborateurRepository;
import dev.repository.ReservationCovoiturageRepository;

/**
 * @author GOBERT Guillaume
 *
 */
@RestController
@CrossOrigin
public class ReservationCovoiturageController {

	@Autowired
	private ReservationCovoiturageRepository reservationCovoitRepo;
	@Autowired
	private AnnonceCovoiturageRepository annonceCovoitRepo;
	@Autowired
	private CollaborateurRepository collaborateurRepo;

	@RequestMapping(method = RequestMethod.GET, path = "/reservations")
	public List<ReservationCovoiturage> listerReservations() {
		return reservationCovoitRepo.findAll();
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/reservations/creer")
	public void creerReservation(@RequestBody ReservationCovoiturage reservation) {
		ReservationCovoiturage nouvelleReservation = new ReservationCovoiturage(reservation.getId(),
				reservation.getCollaborateur(), reservation.getAnnonce());
		if (annonceCovoitRepo.getOne(nouvelleReservation.getAnnonce().getId()) != null
				&& collaborateurRepo.findOne(nouvelleReservation.getCollaborateur().getMatricule()) != null) {
			reservationCovoitRepo.save(nouvelleReservation);
		}
	}

	@RequestMapping(method = RequestMethod.GET, path = "/reservations/{id}")
	public ReservationCovoiturage detailsReservations(@PathVariable Integer id) {
		ReservationCovoiturage detailReservation = new ReservationCovoiturage();
		if (reservationCovoitRepo.findOne(id) != null) {
			detailReservation = reservationCovoitRepo.findOne(id);
		}
		return detailReservation;
	}

}

