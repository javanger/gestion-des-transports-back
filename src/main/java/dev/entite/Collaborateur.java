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

	public Collaborateur(String nom, String prenom, String email, String motDePasse, String telephone, String urlPhoto,
			Boolean administrateur) {
		super(nom, prenom, email, motDePasse, telephone, urlPhoto);
		this.administrateur = administrateur;
	}

}
