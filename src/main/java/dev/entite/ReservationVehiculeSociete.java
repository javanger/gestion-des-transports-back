package dev.entite;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ReservationVehiculeSociete extends Reservation {


	@Column(name = "DATE_DEPART")
	private LocalDate dateDepart;
	@Column(name = "DATE_RETOUR")
	private LocalDate dateRetour;
	@ManyToOne
	private VehiculeSociete vehiculeSociete;
	@ManyToOne
	private Chauffeur chauffeur;

	public ReservationVehiculeSociete() {

	}

	public ReservationVehiculeSociete(Integer id, Collaborateur collaborateur, LocalDate dateDepart,
			LocalDate dateRetour, VehiculeSociete vehiculeSociete, Chauffeur chauffeur) {
		super(id, collaborateur);
		this.dateDepart = dateDepart;
		this.dateRetour = dateRetour;
		this.vehiculeSociete = vehiculeSociete;
		this.chauffeur = chauffeur;
	}

	/**
	 * @return the dateDepart
	 */
	public LocalDate getDateDepart() {
		return dateDepart;
	}

	/**
	 * @param dateDepart
	 *            the dateDepart to set
	 */
	public void setDateDepart(LocalDate dateDepart) {
		this.dateDepart = dateDepart;
	}

	/**
	 * @return the dateRetour
	 */
	public LocalDate getDateRetour() {
		return dateRetour;
	}

	/**
	 * @param dateRetour
	 *            the dateRetour to set
	 */
	public void setDateRetour(LocalDate dateRetour) {
		this.dateRetour = dateRetour;
	}

	/**
	 * @return the vehiculeSociete
	 */
	public VehiculeSociete getVehiculeSociete() {
		return vehiculeSociete;
	}

	/**
	 * @param vehiculeSociete
	 *            the vehiculeSociete to set
	 */
	public void setVehiculeSociete(VehiculeSociete vehiculeSociete) {
		this.vehiculeSociete = vehiculeSociete;
	}

	/**
	 * @return the chauffeur
	 */
	public Chauffeur getChauffeur() {
		return chauffeur;
	}

	/**
	 * @param chauffeur
	 *            the chauffeur to set
	 */
	public void setChauffeur(Chauffeur chauffeur) {
		this.chauffeur = chauffeur;
	}

}
