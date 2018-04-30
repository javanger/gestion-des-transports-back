/**
 * 
 */
package dev.gtb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.gtb.entite.Chauffeur;

/**
 * @author Axel B.
 *
 */
public interface ChauffeurRepository extends JpaRepository<Chauffeur, Integer> {

}
