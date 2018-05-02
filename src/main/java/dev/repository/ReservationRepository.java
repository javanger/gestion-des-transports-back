/**
 * 
 */
package dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.Collaborateur;
import dev.entite.Reservation;

/**
 * @author ETY0004
 *
 */
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

	List<Reservation> findByCollaborateur(Collaborateur collab);
}
