/**
 * 
 */
package dev.entite;

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
	private String duree;
	@Column(name = "DISTANCE")
	private String distance;
	@ManyToOne
	private VehiculePersonnel vehiculePersonnel;
	@Column(name = "NOMBRE_PLACE")
	@Max(20)
	@Min(1)
	private Integer nombrePlace;
	/* Penser a remettre en LocalDate quand jeu de données inutile */
	@Column(name = "DATE")
	private String date;
	@ManyToOne
	private Collaborateur auteurAnnonce;
	@OneToMany
	private List<ReservationCovoiturage> reservations;

	public AnnonceCovoiturage() {
	}

	public AnnonceCovoiturage(String adresseDepart, String adresseArrive, String duree, String distance,
			VehiculePersonnel vehiculePersonnel, Integer nombrePlace, String date, Collaborateur auteurAnnonce,
			List<ReservationCovoiturage> reservations) {
		this.adresseDepart = adresseDepart;
		this.adresseArrive = adresseArrive;
		this.duree = duree;
		this.distance = distance;
		this.vehiculePersonnel = vehiculePersonnel;
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
	public String getDuree() {
		return duree;
	}

	/**
	 * Setter
	 * 
	 * @param duree
	 *            the duree to set
	 */
	public void setDuree(String duree) {
		this.duree = duree;
	}

	/**
	 * Getter
	 * 
	 * @return the distance
	 */
	public String getDistance() {
		return distance;
	}

	/**
	 * Setter
	 * 
	 * @param distance
	 *            the distance to set
	 */
	public void setDistance(String distance) {
		this.distance = distance;
	}

	/**
	 * Getter
	 * 
	 * @return the vehicule
	 */
	public VehiculePersonnel getVehicule() {
		return vehiculePersonnel;
	}

	/**
	 * Setter
	 * 
	 * @param vehicule
	 *            the vehicule to set
	 */
	public void setVehicule(VehiculePersonnel vehiculePersonnel) {
		this.vehiculePersonnel = vehiculePersonnel;
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
	public String getDate() {
		return date;
	}

	/**
	 * Setter
	 * 
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
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
	public List<ReservationCovoiturage> getReservations() {
		return reservations;
	}

	/**
	 * Setter
	 * 
	 * @param reservations
	 *            the reservations to set
	 */
	public void setReservations(List<ReservationCovoiturage> reservations) {
		this.reservations = reservations;
	}

}
