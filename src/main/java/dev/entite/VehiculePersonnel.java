package dev.entite;

import javax.persistence.Entity;

@Entity
public class VehiculePersonnel extends Vehicule {

	public VehiculePersonnel() {

	}

	public VehiculePersonnel(String immatriculation, String marque, String modele) {
		super(immatriculation, marque, modele);
	}

}
