/**
 * 
 */
package dev.gtb.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author GOBERT Guillaume
 *
 */
@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	private AnnonceCovoiturage annonce;
	@ManyToOne
	private Collaborateur collaborateur;

	public Reservation() {
	}

	public Reservation(Integer id, AnnonceCovoiturage annonce, Collaborateur collaborateur) {
		super();
		this.id = id;
		this.annonce = annonce;
		this.collaborateur = collaborateur;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
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

}
