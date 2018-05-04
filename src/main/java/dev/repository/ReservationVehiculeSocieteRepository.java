/**
 * 
 */
package dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.ReservationVehiculeSociete;
import dev.entite.Vehicule;

/**
 * @author ETY0004
 *
 */
public interface ReservationVehiculeSocieteRepository extends JpaRepository<ReservationVehiculeSociete, Integer> {

	/**
	 * @return
	 */
	List<ReservationVehiculeSociete> findByVehiculeSociete(Vehicule v);

}
