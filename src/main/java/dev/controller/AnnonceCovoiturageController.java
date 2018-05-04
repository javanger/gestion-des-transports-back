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

import dev.entite.AnnonceCovoiturage;
import dev.entite.dto.AnnonceCovoiturageDto;
import dev.repository.AnnonceCovoiturageRepository;
import dev.repository.CollaborateurRepository;
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
	@Autowired
	private CollaborateurRepository collaborateurRepo;
	@Autowired
	private ModelMapper modelMapper;

	@RequestMapping(method = RequestMethod.GET, path = "/annonces")
	public List<AnnonceCovoiturageDto> listerAnnonces() {
		List<AnnonceCovoiturageDto> reservationsDto = annonceCovoitRepo.findAll().stream().map(r -> convertToDto(r))
				.collect(Collectors.toList());
		return reservationsDto;
	}

	@RequestMapping(method = RequestMethod.GET, path = "/annonces/{matriculeCollaborateur}")
	public List<AnnonceCovoiturage> listerAnnonces(@PathVariable String matriculeCollaborateur) {
		return annonceCovoitRepo.findByAuteurAnnonce(collaborateurRepo.findOne(matriculeCollaborateur));
	}

	@RequestMapping(method = RequestMethod.POST, path = "/annonces/creer")
	public void creerAnnonce(@RequestBody AnnonceCovoiturage annonce) {
		AnnonceCovoiturage nouvelleAnnonce = new AnnonceCovoiturage(annonce.getAdresseDepart(),
				annonce.getAdresseArrive(), annonce.getDuree(), annonce.getDistance(), annonce.getVehicule(),
				annonce.getNombrePlace(), annonce.getDate(), annonce.getAuteurAnnonce(), annonce.getReservations(),
				annonce.getStatusAnnonce());
		if (vehiculeRepo.findOne(nouvelleAnnonce.getVehicule().getId()) != null
				&& annonce.getAuteurAnnonce().getMatricule() != null) {
			annonceCovoitRepo.save(nouvelleAnnonce);
		} else if (vehiculeRepo.findOne(nouvelleAnnonce.getVehicule().getId()) == null
				&& annonce.getAuteurAnnonce().getMatricule() != null) {
			vehiculeRepo.save(nouvelleAnnonce.getVehicule());
			annonceCovoitRepo.save(nouvelleAnnonce);
		}
	}

	@RequestMapping(method = RequestMethod.GET, path = "/detail/annonces/{id}")
	public AnnonceCovoiturageDto detailsAnnonce(@PathVariable Integer id) {
		AnnonceCovoiturageDto detailAnnonce = new AnnonceCovoiturageDto();
		if (annonceCovoitRepo.findOne(id) != null) {
			detailAnnonce = convertToDto(annonceCovoitRepo.findOne(id));
		}
		return detailAnnonce;
	}

	@RequestMapping(method = RequestMethod.PUT, path = "status/annonces/{id}")
	public void modifierStatut(@RequestBody AnnonceCovoiturageDto annonceDto) {

		AnnonceCovoiturage modifierStatut = annonceCovoitRepo.findOne(annonceDto.getId());
		modifierStatut.setStatusAnnonce(annonceDto.getStatus());
		annonceCovoitRepo.save(modifierStatut);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/annonces/{id}")
	public void modifierAnnonce(@RequestBody AnnonceCovoiturageDto annonceDto) {
		AnnonceCovoiturage modifierAnnonce = annonceCovoitRepo.findOne(annonceDto.getId());
		modifierAnnonce.setNombrePlace(annonceDto.getNombrePlace());
		annonceCovoitRepo.save(modifierAnnonce);
	}

	private AnnonceCovoiturageDto convertToDto(AnnonceCovoiturage annonce) {
		AnnonceCovoiturageDto annonceDto = modelMapper.map(annonce, AnnonceCovoiturageDto.class);
		return annonceDto;
	}

	private AnnonceCovoiturage convertToEntity(AnnonceCovoiturageDto annonceDto) {
		AnnonceCovoiturage annonce = modelMapper.map(annonceDto, AnnonceCovoiturage.class);
		return annonce;
	}

}
