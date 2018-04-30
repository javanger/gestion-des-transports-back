package dev.gtb.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VEHICULE")

public class Vehicule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "IMMATRICULATION")
	private String immatriculation;

	@Column(name = "MARQUE")
	private String marque;

	@Column(name = "MODELE")
	private String modele;

	@Column(name = "CATEGORIE")
	@Enumerated(EnumType.STRING)
	private CategorieVehicule categorie;

	@Column(name = "NOMBRE_DE_PLACE")
	private Integer nbPlaces;

	@Column(name = "URL_PHOTO")
	private String urlPhoto;

	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicule(String immatriculation, String marque, String modele, CategorieVehicule categorie, Integer nbPlaces,
			String urlPhoto) {
		super();
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.modele = modele;
		this.categorie = categorie;
		this.nbPlaces = nbPlaces;
		this.urlPhoto = urlPhoto;
	}

	// public Vehicule(String immatriculation, String marque, String modele,
	// String categorie, Integer nbPlaces,
	// String urlPhoto) {
	// // TODO Auto-generated constructor stub
	// super();
	// this.immatriculation = immatriculation;
	// this.marque = marque;
	// this.modele = modele;
	// this.nbPlaces = nbPlaces;
	// this.categorie = categorie;
	// this.urlPhoto = urlPhoto;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicule [id=" + id + ", immatriculation=" + immatriculation + ", marque=" + marque + ", modele="
				+ modele + ", categorie=" + categorie + ", nbPlaces=" + nbPlaces + ", urlPhoto=" + urlPhoto + "]";
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
	 * @return the immatriculation
	 */
	public String getImmatriculation() {
		return immatriculation;
	}

	/**
	 * Setter
	 * 
	 * @param immatriculation
	 *            the immatriculation to set
	 */
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	/**
	 * Getter
	 * 
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * Setter
	 * 
	 * @param marque
	 *            the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * Getter
	 * 
	 * @return the modele
	 */
	public String getModele() {
		return modele;
	}

	/**
	 * Setter
	 * 
	 * @param modele
	 *            the modele to set
	 */
	public void setModele(String modele) {
		this.modele = modele;
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
	 * @return the nbPlaces
	 */
	public Integer getNbPlaces() {
		return nbPlaces;
	}

	/**
	 * Setter
	 * 
	 * @param nbPlaces
	 *            the nbPlaces to set
	 */
	public void setNbPlaces(Integer nbPlaces) {
		this.nbPlaces = nbPlaces;
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

}
