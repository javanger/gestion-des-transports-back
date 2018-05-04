/**
 * 
 */
package dev.entite;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author GOBERT Guillaume
 *
 */
@Entity
public class Collaborateur extends Employe {

	@Column(name = "ADMINISTRATEUR")
	private Boolean administrateur;

	private Collaborateur() {
		super();
	}

	public Collaborateur(String matricule, String nom, String prenom, String email, String motDePasse, String urlPhoto,
			Boolean administrateur) {
		super(matricule, nom, prenom, email, motDePasse, urlPhoto);
		this.administrateur = administrateur;
	}

	/**
	 * @return the administrateur
	 */
	public Boolean getAdministrateur() {
		return administrateur;
	}

	/**
	 * @param administrateur
	 *            the administrateur to set
	 */
	public void setAdministrateur(Boolean administrateur) {
		this.administrateur = administrateur;
	}

}
