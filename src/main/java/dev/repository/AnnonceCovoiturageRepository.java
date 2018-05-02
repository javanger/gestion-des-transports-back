/**
 * 
 */
package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.AnnonceCovoiturage;

/**
 * @author GOBERT Guillaume
 *
 */
public interface AnnonceCovoiturageRepository extends JpaRepository<AnnonceCovoiturage, Integer> {
}
