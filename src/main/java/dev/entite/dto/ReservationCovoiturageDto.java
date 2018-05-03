/**
 * 
 */
package dev.entite.dto;

import dev.entite.Collaborateur;
import dev.entite.Status;

/**
 * @author GOBERT Guillaume
 *
 */
public class ReservationCovoiturageDto {

	private Integer id;
	private Collaborateur collaborateur;
	private AnnonceCovoiturageDto annonce;
	private Status statusReservation;

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
	 * @return the collaborateur
	 */
	public Collaborateur getCollaborateur() {
		return collaborateur;
	}

	/**
	 * Setter
	 * 
	 * @param collaborateur
	 *            the collaborateur to set
	 */
	public void setCollaborateur(Collaborateur collaborateur) {
		this.collaborateur = collaborateur;
	}

	/**
	 * Getter
	 * 
	 * @return the annonce
	 */
	public AnnonceCovoiturageDto getAnnonce() {
		return annonce;
	}

	/**
	 * Setter
	 * 
	 * @param annonce
	 *            the annonce to set
	 */
	public void setAnnonce(AnnonceCovoiturageDto annonce) {
		this.annonce = annonce;
	}

	/**
	 * Getter
	 * 
	 * @return the statusReservation
	 */
	public Status getStatusReservation() {
		return statusReservation;
	}

	/**
	 * Setter
	 * 
	 * @param statusReservation
	 *            the statusReservation to set
	 */
	public void setStatusReservation(Status statusReservation) {
		this.statusReservation = statusReservation;
	}

}
