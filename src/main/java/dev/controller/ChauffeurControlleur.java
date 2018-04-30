/**
 * 
 */
package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.gtb.entite.Chauffeur;
import dev.gtb.repository.ChauffeurRepository;

/**
 * @author Axel B.
 *
 */
@Controller
@CrossOrigin
@RequestMapping("/chauffeur")
public class ChauffeurControlleur {

	@Autowired
	ChauffeurRepository chauffeurRepository;

	@GetMapping
	public List<Chauffeur> listerChauffeurs() {
		return this.chauffeurRepository.findAll();
	}

}
