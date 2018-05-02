/**
 * 
 */
package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.Collaborateur;

/**
 * @author Gobert Guillaume
 *
 */
public interface CollaborateurRepository extends JpaRepository<Collaborateur, String> {

}
