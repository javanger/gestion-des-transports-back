/**
 * 
 */
package dev.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.entite.ReservationVehiculeSociete;
import dev.repository.ReservationVehiculeSocieteRepository;
import dev.repository.VehiculeSocieteRepository;

/**
 * @author Axel B.
 *
 */
@RestController
@CrossOrigin
public class ReservationVehiculeSocieteController {

	@Autowired
	ReservationVehiculeSocieteRepository reservationVehiculeSocieteRepository;

	@Autowired
	VehiculeSocieteRepository vehiculeSocieteRepository;

	@RequestMapping(method = RequestMethod.GET, path = "/reservationsSociete")
	public List<ReservationVehiculeSociete> listerAnnonces() {
		return reservationVehiculeSocieteRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, path = "/reservationsSociete/{immatriculation}")
	public List<ReservationVehiculeSociete> detailsReservationsSociete(@PathVariable String immatriculation) {
		List<ReservationVehiculeSociete> detailReservation = new ArrayList<ReservationVehiculeSociete>();
		if (reservationVehiculeSocieteRepository.findByVehiculeSociete(
				vehiculeSocieteRepository.findVehiculeByImmatriculation(immatriculation)) != null) {
			detailReservation = reservationVehiculeSocieteRepository
					.findByVehiculeSociete(vehiculeSocieteRepository.findVehiculeByImmatriculation(immatriculation));
		}
		return detailReservation;
	}
}
