/**
 * 
 */
package dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.AnnonceCovoiturage;
import dev.entite.Collaborateur;

/**
 * @author GOBERT Guillaume
 *
 */
public interface AnnonceCovoiturageRepository extends JpaRepository<AnnonceCovoiturage, Integer> {

	List<AnnonceCovoiturage> findByAuteurAnnonce(Collaborateur collab);
}
