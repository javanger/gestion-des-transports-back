/**
 * 
 */
package dev.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.gtb.entite.Reservation;

/**
 * @author ETY0004
 *
 */
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
