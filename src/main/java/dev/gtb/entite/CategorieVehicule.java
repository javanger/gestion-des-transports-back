package dev.gtb.entite;

public enum CategorieVehicule {

	MICRO_URBAINE("Micro-urbaines"), 
	MINI_CITADINE("Mini-citadines"), 
	CITADINE_POLYVALENTE("Citadines polyvalentes"), 
	COMPACTE("Compactes"), 
	BERLINE_TAILLE_S("Berline Taille S"), 
	BERLINE_TAILLE_M("Berline Taille M"), 
	BERLINE_TAILLE_L("Berline Taille L"), 
	SUV("Suv"), 
	TOUT_TERRAINS("Tout terrain"), 
	PICK_UP("Pick-up");

	private String value;

	private CategorieVehicule(String value) {

		this.value = value;
	}

	public String getValue() {

		return value;
	}



}
