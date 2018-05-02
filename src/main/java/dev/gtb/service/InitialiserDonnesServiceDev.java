package dev.gtb.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.gtb.entite.CategorieVehicule;
import dev.gtb.entite.Vehicule;
import dev.gtb.repository.VehiculeRepository;

@Service
public class InitialiserDonnesServiceDev implements InitialiserDonneesService {
	@PersistenceContext
	private EntityManager em;

	@Autowired
	private VehiculeRepository vehiculeRepo;

	@Override
	@Transactional
	public void initialiser() {
		// TODO Auto-generated method stub
		Vehicule voiture1 = new Vehicule("22-ABCD-44", "Toyota", "yaris", CategorieVehicule.COMPACTE, 5,
				"https://www.toyota.fr/new-cars/yaris/index.json");
		Vehicule voiture2 = new Vehicule("54-ABCD-63", "Renault", "megane", CategorieVehicule.CITADINE_POLYVALENTE, 5,
				"https://www.toyota.fr/new-cars/yaris/index.json");
		Vehicule voiture3 = new Vehicule("23-ABCD-47", "Peugeot", "308", CategorieVehicule.MINI_CITADINE, 2,
				"https://www.toyota.fr/new-cars/yaris/index.json");
		Vehicule voiture4 = new Vehicule("69-ABCD-69", "Dacia", "duster", CategorieVehicule.TOUT_TERRAINS, 5,
				"https://www.toyota.fr/new-cars/yaris/index.json");
		Vehicule voiture5 = new Vehicule("62-ABCD-44", "Volvo", "xc350", CategorieVehicule.valueOf("COMPACTE"), 5,
				"https://www.toyota.fr/new-cars/yaris/index.json");
		Vehicule voiture6 = new Vehicule("59-ABCD-87", "huyndai", "i20", CategorieVehicule.COMPACTE, 2,
				"https://www.toyota.fr/new-cars/yaris/index.json");

		vehiculeRepo.save(voiture1);
		vehiculeRepo.save(voiture2);
		vehiculeRepo.save(voiture3);
		vehiculeRepo.save(voiture4);
		vehiculeRepo.save(voiture5);
		vehiculeRepo.save(voiture6);
	}
}
