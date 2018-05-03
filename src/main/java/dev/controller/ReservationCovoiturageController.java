/**
 * 
 */
package dev.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.entite.ReservationCovoiturage;
import dev.entite.Status;
import dev.entite.dto.ReservationCovoiturageDto;
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
	@Autowired
	private ModelMapper modelMapper;

	@RequestMapping(method = RequestMethod.GET, path = "/reservations")
	public List<ReservationCovoiturageDto> listerReservations() {
		List<ReservationCovoiturageDto> reservationsDto = reservationCovoitRepo.findAll().stream()
				.map(r -> convertToDto(r)).collect(Collectors.toList());
		return reservationsDto;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/reservations/{matriculeCollaborateur}")
	public List<ReservationCovoiturageDto> listerReservations(@PathVariable String matriculeCollaborateur) {
		return reservationCovoitRepo.findByCollaborateur(collaborateurRepo.findOne(matriculeCollaborateur)).stream()
				.map(r -> convertToDto(r)).collect(Collectors.toList());
	}

	@RequestMapping(method = RequestMethod.POST, path = "/reservations/creer")
	public void creerReservation(@RequestBody ReservationCovoiturageDto reservationDto) {
		ReservationCovoiturage nouvelleReservation = convertToEntity(reservationDto);
		if (annonceCovoitRepo.getOne(nouvelleReservation.getAnnonce().getId()).getStatusAnnonce()
				.equals(Status.EN_COURS)) {
			reservationCovoitRepo.save(nouvelleReservation);
		}
	}

	@RequestMapping(method = RequestMethod.GET, path = "/detail/reservations/{id}")
	public ReservationCovoiturageDto detailsReservations(@PathVariable Integer id) {
		ReservationCovoiturage detailReservation = new ReservationCovoiturage();
		if (reservationCovoitRepo.findOne(id) != null) {
			detailReservation = reservationCovoitRepo.findOne(id);
		}
		return convertToDto(detailReservation);
	}

	@RequestMapping(method = RequestMethod.PUT, path="/reservations/{id}")
	public void modifierStatut(@RequestBody ReservationCovoiturageDto reservationDto) {
		ReservationCovoiturage modifierReservation = convertToEntity(reservationDto);
		reservationCovoitRepo.save(modifierReservation);
	}

	private ReservationCovoiturageDto convertToDto(ReservationCovoiturage reservation) {
		ReservationCovoiturageDto reservationDto = modelMapper.map(reservation, ReservationCovoiturageDto.class);
		return reservationDto;
	}

	private ReservationCovoiturage convertToEntity(ReservationCovoiturageDto reservationDto) {
		ReservationCovoiturage reservation = modelMapper.map(reservationDto, ReservationCovoiturage.class);
		return reservation;
	}

}

