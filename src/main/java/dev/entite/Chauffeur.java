/**
 * 
 */
package dev.entite;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author ETY0004
 *
 */
@Entity
public class Chauffeur extends Employe {

	@Column(name = "PERMIS")
	private Boolean permis;
	@Column(name = "TELEPHONE")
	private String telephone;

	public Chauffeur() {
		super();
	}
	
	public Chauffeur(String matricule, String nom, String prenom, String email, String motDePasse, String telephone,
			String urlPhoto, Boolean permis) {
		super(matricule, nom, prenom, email, motDePasse, urlPhoto);
		this.permis = permis;
		this.telephone = telephone;
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

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone
	 *            the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
}
