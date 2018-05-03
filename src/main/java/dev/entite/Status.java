/**
 * 
 */
package dev.entite;

/**
 * @author GOBERT Guillaume
 *
 */
public enum Status {

	EN_COURS("En cours"), TERMINE("Terminé"), ANNULE("Annulé");

	private String status;

	private Status(String status) {

		this.status = status;
	}

	public String getStatus() {

		return status;
	}

}
