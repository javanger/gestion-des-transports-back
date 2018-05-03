/**
 * 
 */
package dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.Collaborateur;
import dev.entite.ReservationCovoiturage;

/**
 * @author ETY0004
 *
 */
public interface ReservationCovoiturageRepository extends JpaRepository<ReservationCovoiturage, Integer> {

	List<ReservationCovoiturage> findByCollaborateur(Collaborateur collab);
}
