/**
 * 
 */
package dev.entite.dto;

import dev.entite.Collaborateur;
import dev.entite.Status;
import dev.entite.Vehicule;

/**
 * @author GOBERT Guillaume
 *
 */
public class AnnonceCovoiturageDto {
	
	private Integer id;
	private String adresseDepart;
	private String adresseArrive;
	private Integer nombrePlace;
	private Vehicule vehicule;
	private String date;
	private Collaborateur auteurAnnonce;
	private Status status;

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
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Setter
	 * 
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
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
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * Setter
	 * 
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

}
