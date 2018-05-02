package dev.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.entite.CategorieVehicule;
import dev.entite.Chauffeur;
import dev.entite.Collaborateur;
import dev.entite.Vehicule;
import dev.repository.VehiculeRepository;

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
				"http://www.envoiturecarine.fr/wp-content/uploads/2015/08/lamborghini-aventador.jpg");
		Vehicule voiture2 = new Vehicule("54-ABCD-63", "Renault", "megane", CategorieVehicule.CITADINE_POLYVALENTE, 5,
				"http://www.envoiturecarine.fr/wp-content/uploads/2015/08/lamborghini-aventador.jpg");
		Vehicule voiture3 = new Vehicule("23-ABCD-47", "Peugeot", "308", CategorieVehicule.MINI_CITADINE, 2,
				"http://www.envoiturecarine.fr/wp-content/uploads/2015/08/lamborghini-aventador.jpg");
		Vehicule voiture4 = new Vehicule("69-ABCD-69", "Dacia", "duster", CategorieVehicule.TOUT_TERRAINS, 5,
				"http://www.envoiturecarine.fr/wp-content/uploads/2015/08/lamborghini-aventador.jpg");
		Vehicule voiture5 = new Vehicule("62-ABCD-44", "Volvo", "xc350", CategorieVehicule.valueOf("COMPACTE"), 5,
				"http://www.envoiturecarine.fr/wp-content/uploads/2015/08/lamborghini-aventador.jpg");
		Vehicule voiture6 = new Vehicule("59-ABCD-87", "huyndai", "i20", CategorieVehicule.valueOf("COMPACTE"), 2,
				"http://www.envoiturecarine.fr/wp-content/uploads/2015/08/lamborghini-aventador.jpg");

		vehiculeRepo.save(voiture1);
		vehiculeRepo.save(voiture2);
		vehiculeRepo.save(voiture3);
		vehiculeRepo.save(voiture4);
		vehiculeRepo.save(voiture5);
		vehiculeRepo.save(voiture6);
		System.out.println(voiture6);

		List<Chauffeur> listeChauffeur = new ArrayList<Chauffeur>();

		listeChauffeur.add(new Chauffeur("Corentin", "courvite", "c.courvite@gmail.com", "123", "06 40 42 89 78",
				"https://www.closermag.fr/var/closermag/storage/images/article/michael-fassbender-je-suis-une-personne-totalement-stupide-!-723590/5691650-1-fre-FR/Michael-Fassbender-Je-suis-une-personne-totalement-stupide-!.jpg",
				true));

		listeChauffeur.forEach(em::persist);

		List<Collaborateur> listeCollaborateur = new ArrayList<Collaborateur>();

		listeCollaborateur.add(new Collaborateur("Paul", "ar", "p.ar@gmail.com", "456", "06 40 28 29 22",
				"http://www.lepoint.fr/images/2017/07/21/9487508lpw-9488117-article-paul-ricoeur-jpg_4440299_1250x625.jpg",
				true));
		listeCollaborateur.add(new Collaborateur("Gerard", "menvu", "gmenvu@gmail.com", "789", "02 04 06 08 10",
				"https://o.aolcdn.com/images/dims3/GLOB/crop/3494x1751+0+263/resize/630x315!/format/jpg/quality/85/http%3A%2F%2Fo.aolcdn.com%2Fhss%2Fstorage%2Fmidas%2F5f7b78997fded4fe2973e04d09d146f0%2F206140087%2FRTX3ETVB.jpeg",
				false));

		listeCollaborateur.forEach(em::persist);

	}

}
