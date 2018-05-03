package dev.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RESERVATION_VEHICULE_SOCIETE")
public class ReservationVehiculeSociete extends Reservation {

	@Column(name = "DATE_DEPART")
	private String dateDepart;
	@Column(name = "DATE_RETOUR")
	private String dateRetour;
	@ManyToOne
	private VehiculeSociete vehiculeSociete;
	@ManyToOne
	private Chauffeur chauffeur;

	public ReservationVehiculeSociete() {

	}

	public ReservationVehiculeSociete(Integer id, Collaborateur collaborateur, String dateDepart, String dateRetour,
			VehiculeSociete vehiculeSociete, Chauffeur chauffeur) {
		super(id, collaborateur);
		this.dateDepart = dateDepart;
		this.dateRetour = dateRetour;
		this.vehiculeSociete = vehiculeSociete;
		this.chauffeur = chauffeur;
	}

	/**
	 * @return the dateDepart
	 */
	public String getDateDepart() {
		return dateDepart;
	}

	/**
	 * @param dateDepart
	 *            the dateDepart to set
	 */
	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

	/**
	 * @return the dateRetour
	 */
	public String getDateRetour() {
		return dateRetour;
	}

	/**
	 * @param dateRetour
	 *            the dateRetour to set
	 */
	public void setDateRetour(String dateRetour) {
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
