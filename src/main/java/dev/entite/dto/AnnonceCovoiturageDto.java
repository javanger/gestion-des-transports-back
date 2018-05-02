/**
 * 
 */
package dev.entite.dto;

import java.time.LocalDate;
import java.util.List;

import dev.entite.Collaborateur;
import dev.entite.Vehicule;

/**
 * @author GOBERT Guillaume
 *
 */
public class AnnonceCovoiturageDto {

	private Integer id;
	private String adresseDepart;
	private String adresseArrive;
	private String duree;
	private String distance;
	private Vehicule vehicule;
	private Integer nombrePlace;
	private LocalDate date;
	private Collaborateur auteurAnnonce;
	private List<ReservationDto> reservations;

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the adresseDepart
	 */
	public String getAdresseDepart() {
		return adresseDepart;
	}

	/**
	 * Setter
	 * 
	 * @param adresseDepart
	 *            the adresseDepart to set
	 */
	public void setAdresseDepart(String adresseDepart) {
		this.adresseDepart = adresseDepart;
	}

	/**
	 * Getter
	 * 
	 * @return the adresseArrive
	 */
	public String getAdresseArrive() {
		return adresseArrive;
	}

	/**
	 * Setter
	 * 
	 * @param adresseArrive
	 *            the adresseArrive to set
	 */
	public void setAdresseArrive(String adresseArrive) {
		this.adresseArrive = adresseArrive;
	}

	/**
	 * Getter
	 * 
	 * @return the duree
	 */
	public String getDuree() {
		return duree;
	}

	/**
	 * Setter
	 * 
	 * @param duree
	 *            the duree to set
	 */
	public void setDuree(String duree) {
		this.duree = duree;
	}

	/**
	 * Getter
	 * 
	 * @return the distance
	 */
	public String getDistance() {
		return distance;
	}

	/**
	 * Setter
	 * 
	 * @param distance
	 *            the distance to set
	 */
	public void setDistance(String distance) {
		this.distance = distance;
	}

	/**
	 * Getter
	 * 
	 * @return the vehicule
	 */
	public Vehicule getVehicule() {
		return vehicule;
	}

	/**
	 * Setter
	 * 
	 * @param vehicule
	 *            the vehicule to set
	 */
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	/**
	 * Getter
	 * 
	 * @return the nombrePlace
	 */
	public Integer getNombrePlace() {
		return nombrePlace;
	}

	/**
	 * Setter
	 * 
	 * @param nombrePlace
	 *            the nombrePlace to set
	 */
	public void setNombrePlace(Integer nombrePlace) {
		this.nombrePlace = nombrePlace;
	}

	/**
	 * Getter
	 * 
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Setter
	 * 
	 * @param date
	 *            the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Getter
	 * 
	 * @return the auteurAnnonce
	 */
	public Collaborateur getAuteurAnnonce() {
		return auteurAnnonce;
	}

	/**
	 * Setter
	 * 
	 * @param auteurAnnonce
	 *            the auteurAnnonce to set
	 */
	public void setAuteurAnnonce(Collaborateur auteurAnnonce) {
		this.auteurAnnonce = auteurAnnonce;
	}

	/**
	 * Getter
	 * 
	 * @return the reservations
	 */
	public List<ReservationDto> getReservations() {
		return reservations;
	}

	/**
	 * Setter
	 * 
	 * @param reservations
	 *            the reservations to set
	 */
	public void setReservations(List<ReservationDto> reservations) {
		this.reservations = reservations;
	}

}
