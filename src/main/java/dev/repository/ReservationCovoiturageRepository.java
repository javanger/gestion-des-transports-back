/**
 * 
 */
package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.ReservationCovoiturage;

/**
 * @author ETY0004
 *
 */
public interface ReservationCovoiturageRepository extends JpaRepository<ReservationCovoiturage, Integer> {

}
