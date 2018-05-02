package dev.entite;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Vehicule {

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

	@Column(name = "NOMBRE_DE_PLACE")
	private Integer nbPlaces;


	public Vehicule() {
	}

	public Vehicule(String immatriculation, String marque, String modele, Integer nbPlaces) {
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.modele = modele;
		this.nbPlaces = nbPlaces;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicule [id=" + id + ", immatriculation=" + immatriculation + ", marque=" + marque + ", modele="
				+ modele + ", nbPlaces=" + nbPlaces + "]";
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


}
