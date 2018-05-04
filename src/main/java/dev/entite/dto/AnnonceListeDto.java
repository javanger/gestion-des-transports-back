/**
 * 
 */
package dev.entite.dto;

import java.util.List;

import dev.entite.Status;

/**
 * @author AHSENE Victor
 *
 */
public class AnnonceListeDto {

	private Integer id;
	private String adresseDepart;
	private String adresseArrive;


	private String date;

	private Status status;
	private List<ReservationNombreDto> reservations;

	/**
	 * Getter
	 * 
	 * @return the reservations
	 */
	public List<ReservationNombreDto> getReservations() {
		return reservations;
	}

	/**
	 * Setter
	 * 
	 * @param reservations
	 *            the reservations to set
	 */
	public void setReservations(List<ReservationNombreDto> reservations) {
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
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * Setter
	 * 
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

}
