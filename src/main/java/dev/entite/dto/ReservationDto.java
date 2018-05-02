/**
 * 
 */
package dev.entite.dto;

import dev.entite.Collaborateur;

/**
 * @author GOBERT Guillaume
 *
 */
public class ReservationDto {

	private Integer id;
	private Collaborateur collaborateur;
	private AnnonceCovoiturageDto annonce;

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

}
