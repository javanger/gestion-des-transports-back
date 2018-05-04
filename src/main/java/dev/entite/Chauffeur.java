/**
 * 
 */
package dev.entite;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Axel B.
 *
 */
@Entity
public class Chauffeur extends Employe {

	@Column(name = "PERMIS")
	private Boolean permis;

	public Chauffeur(String nom, String prenom, String email, String motDePasse, String telephone, String urlPhoto,
			Boolean permis) {
		super(nom, prenom, email, motDePasse, telephone, urlPhoto);
		this.permis = permis;
	}

	/**
	 * Getter
	 * 
	 * @return the permis
	 */
	public Boolean getPermis() {
		return permis;
	}

	/**
	 * Setter
	 * 
	 * @param permis
	 *            the permis to set
	 */
	public void setPermis(Boolean permis) {
		this.permis = permis;
	}

}
