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

	public Vehicule() {
	}

	public Vehicule(String immatriculation, String marque, String modele) {
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.modele = modele;
	}

	@Override
	public String toString() {
		return "Vehicule [id=" + id + ", immatriculation=" + immatriculation + ", marque=" + marque + ", modele="
				+ modele + "]";
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

}
