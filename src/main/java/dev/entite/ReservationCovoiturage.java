package dev.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
public class ReservationCovoiturage extends Reservation {

	@ManyToOne
	private AnnonceCovoiturage annonce;
	@Column(name = "STATUT")
	@Enumerated(EnumType.STRING)
	private Status statusReservation;

	public ReservationCovoiturage() {

	}

	public ReservationCovoiturage(Integer id, Collaborateur collaborateur, AnnonceCovoiturage annonce, Status status) {
		super(id, collaborateur);
		this.annonce = annonce;
		this.statusReservation = status;
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
