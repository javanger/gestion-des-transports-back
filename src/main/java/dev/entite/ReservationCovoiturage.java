package dev.entite;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ReservationCovoiturage extends Reservation {

	@ManyToOne
	private AnnonceCovoiturage annonce;

	public ReservationCovoiturage() {

	}

	public ReservationCovoiturage(Integer id, Collaborateur collaborateur, AnnonceCovoiturage annonce) {
		super(id, collaborateur);
		this.annonce = annonce;
	}

	/**
	 * Getter
	 * 
	 * @return the annonce
	 */
	public AnnonceCovoiturage getAnnonce() {
		return annonce;
	}

	/**
	 * Setter
	 * 
	 * @param annonce
	 *            the annonce to set
	 */
	public void setAnnonce(AnnonceCovoiturage annonce) {
		this.annonce = annonce;
	}
}
