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

import dev.entite.Reservation;
import dev.repository.AnnonceCovoiturageRepository;
import dev.repository.CollaborateurRepository;
import dev.repository.ReservationRepository;

/**
 * @author GOBERT Guillaume
 *
 */
@RestController
@CrossOrigin
public class ReservationController {

	@Autowired
	private ReservationRepository reservationRepo;
	@Autowired
	private AnnonceCovoiturageRepository annonceCovoitRepo;
	@Autowired
	private CollaborateurRepository collaborateurRepo;

	@RequestMapping(method = RequestMethod.GET, path = "/reservations")
	public List<Reservation> listerReservations() {
		return reservationRepo.findAll();
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/reservations/creer")
	public void creerReservation(@RequestBody Reservation reservation) {
		Reservation nouvelleReservation = new Reservation(reservation.getId(), reservation.getAnnonce(),
				reservation.getCollaborateur());
		if (annonceCovoitRepo.getOne(nouvelleReservation.getAnnonce().getId()) != null
				&& collaborateurRepo.findOne(nouvelleReservation.getCollaborateur().getMatricule()) != null) {
			reservationRepo.save(nouvelleReservation);
		}
	}

	@RequestMapping(method = RequestMethod.GET, path = "/reservations/{id}")
	public Reservation detailsReservations(@PathVariable Integer id) {
		Reservation detailReservation = new Reservation();
		if (reservationRepo.findOne(id) != null) {
			detailReservation = reservationRepo.findOne(id);
		}
		return detailReservation;
	}

}

