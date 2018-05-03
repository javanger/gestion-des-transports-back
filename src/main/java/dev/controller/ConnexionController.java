/**
 * 
 */
package dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Axel B.
 *
 */
@Controller
@CrossOrigin
@RequestMapping("/connexion")
public class ConnexionController {

	@GetMapping
	public String afficherPageConnexion() {
		return "connexion";
	}

}
