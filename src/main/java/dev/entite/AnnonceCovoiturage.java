/**
 * 
 */
package dev.entite;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author GOBERT Guillaume
 *
 */
@Entity
@Table(name = "ANNONCE_COVOITURAGE")
public class AnnonceCovoiturage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "ADRESSE_DEPART")
	private String adresseDepart;
	@Column(name = "ADRESSE_ARRIVE")
	private String adresseArrive;
	@Column(name = "DUREE")
	private Integer duree;
	@Column(name = "DISTANCE")
	private Double distance;
	@ManyToOne
	private Vehicule vehicule;
	@Column(name = "NOMBRE_PLACE")
	@Max(20)
	@Min(1)
	private Integer nombrePlace;
	@Column(name = "DATE")
	private LocalDate date;
	@ManyToOne
	private Collaborateur auteurAnnonce;
	@OneToMany
	private List<Reservation> reservations;

	public AnnonceCovoiturage() {
	}

	public AnnonceCovoiturage(String adresseDepart, String adresseArrive, Integer duree, Double distance,
			Vehicule vehicule, Integer nombrePlace, LocalDate date, Collaborateur auteurAnnonce,
			List<Reservation> reservations) {
		this.adresseDepart = adresseDepart;
		this.adresseArrive = adresseArrive;
		this.duree = duree;
		this.distance = distance;
		this.vehicule = vehicule;
		this.nombrePlace = nombrePlace;
		this.date = date;
		this.auteurAnnonce = auteurAnnonce;
		this.reservations = reservations;
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
	 * @return the adresseDepart
	 */
	public String getAdresseDepart() {
		return adresseDepart;
	}

	/**
	 * Setter
	 * 
	 * @param adresseDepart
	 *            the adresseDepart to set
	 */
	public void setAdresseDepart(String adresseDepart) {
		this.adresseDepart = adresseDepart;
	}

	/**
	 * Getter
	 * 
	 * @return the adresseArrive
	 */
	public String getAdresseArrive() {
		return adresseArrive;
	}

	/**
	 * Setter
	 * 
	 * @param adresseArrive
	 *            the adresseArrive to set
	 */
	public void setAdresseArrive(String adresseArrive) {
		this.adresseArrive = adresseArrive;
	}

	/**
	 * Getter
	 * 
	 * @return the duree
	 */
	public Integer getDuree() {
		return duree;
	}

	/**
	 * Setter
	 * 
	 * @param duree
	 *            the duree to set
	 */
	public void setDuree(Integer duree) {
		this.duree = duree;
	}

	/**
	 * Getter
	 * 
	 * @return the distance
	 */
	public Double getDistance() {
		return distance;
	}

	/**
	 * Setter
	 * 
	 * @param distance
	 *            the distance to set
	 */
	public void setDistance(Double distance) {
		this.distance = distance;
	}

	/**
	 * Getter
	 * 
	 * @return the vehicule
	 */
	public Vehicule getVehicule() {
		return vehicule;
	}

	/**
	 * Setter
	 * 
	 * @param vehicule
	 *            the vehicule to set
	 */
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	/**
	 * Getter
	 * 
	 * @return the nombrePlace
	 */
	public Integer getNombrePlace() {
		return nombrePlace;
	}

	/**
	 * Setter
	 * 
	 * @param nombrePlace
	 *            the nombrePlace to set
	 */
	public void setNombrePlace(Integer nombrePlace) {
		this.nombrePlace = nombrePlace;
	}

	/**
	 * Getter
	 * 
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Setter
	 * 
	 * @param date
	 *            the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Getter
	 * 
	 * @return the auteurAnnonce
	 */
	public Collaborateur getAuteurAnnonce() {
		return auteurAnnonce;
	}

	/**
	 * Setter
	 * 
	 * @param auteurAnnonce
	 *            the auteurAnnonce to set
	 */
	public void setAuteurAnnonce(Collaborateur auteurAnnonce) {
		this.auteurAnnonce = auteurAnnonce;
	}

	/**
	 * Getter
	 * 
	 * @return the reservations
	 */
	public List<Reservation> getReservations() {
		return reservations;
	}

	/**
	 * Setter
	 * 
	 * @param reservations
	 *            the reservations to set
	 */
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}
