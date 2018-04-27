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
}
