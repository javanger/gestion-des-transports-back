/**
 * 
 */
package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.ReservationCovoiturage;

/**
 * @author Lefebvre Valentin
 *
 */
public interface ReservationCovoiturageRepository extends JpaRepository<ReservationCovoiturage, Integer> {

}
