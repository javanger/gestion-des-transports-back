/**
 * 
 */
package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.Chauffeur;

/**
 * @author Axel B.
 *
 */
public interface ChauffeurRepository extends JpaRepository<Chauffeur, Integer> {

}
