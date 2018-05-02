package dev.service;

import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import dev.entite.AnnonceCovoiturage;
import dev.entite.Chauffeur;
import dev.entite.Collaborateur;
import dev.entite.Reservation;
import dev.entite.Vehicule;

@Service
public class InitialiserDonnesServiceDev implements InitialiserDonneesService {
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public void initialiser() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configWeb.xml");

		Stream.of(Collaborateur.class, Chauffeur.class, AnnonceCovoiturage.class, Reservation.class, Vehicule.class)
				.flatMap(classe -> context.getBeansOfType(classe).values().stream()).forEach(em::persist);
		context.close();

	}




}
