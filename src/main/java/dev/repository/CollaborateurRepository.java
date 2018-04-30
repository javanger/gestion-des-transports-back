/**
 * 
 */
package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.gtb.entite.Collaborateur;

/**
 * @author Gobert Guillaume
 *
 */
public interface CollaborateurRepository extends JpaRepository<Collaborateur, Integer> {

}
