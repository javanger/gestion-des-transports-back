package dev.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class VehiculeSociete extends Vehicule {

	@Column(name = "CATEGORIE")
	@Enumerated(EnumType.STRING)
	private CategorieVehicule categorie;

	@Column(name = "URL_PHOTO")
	private String urlPhoto;

	@Column(name = "NOMBRE_DE_PLACE")
	private Integer nbPlaces;

	public VehiculeSociete() {

	}

	public VehiculeSociete(String immatriculation, String marque, String modele, CategorieVehicule categorie, Integer nbPlaces,
			String urlPhoto){
		super(immatriculation, marque, modele);
		this.nbPlaces = nbPlaces;
		this.categorie = categorie;
		this.urlPhoto = urlPhoto;
	}

	/**
	 * Getter
	 * 
	 * @return the categorie
	 */
	public CategorieVehicule getCategorie() {

		return categorie;
	}

	/**
	 * Setter
	 * 
	 * @param categorie
	 *            the categorie to set
	 */
	public void setCategorie(CategorieVehicule categorie) {
		this.categorie = categorie;
	}

	/**
	 * Getter
	 * 
	 * @return the urlPhoto
	 */
	public String getUrlPhoto() {
		return urlPhoto;
	}

	/**
	 * Setter
	 * 
	 * @param urlPhoto
	 *            the urlPhoto to set
	 */
	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	/**
	 * @return the nbPlaces
	 */
	public Integer getNbPlaces() {
		return nbPlaces;
	}

	/**
	 * @param nbPlaces
	 *            the nbPlaces to set
	 */
	public void setNbPlaces(Integer nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

}
