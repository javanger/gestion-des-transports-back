/**
 * 
 */
package dev.gtb.entite;

import javax.persistence.Entity;

/**
 * @author GOBERT Guillaume
 *
 */
@Entity
public class Collaborateur extends Employe {

	public Collaborateur(String nom, String prenom, String email, String telephone, String urlPhoto) {
		super(nom, prenom, email, telephone, urlPhoto);
	}

}