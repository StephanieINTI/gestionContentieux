package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.inti.entities.Affaire;
import com.inti.service.interfaces.IAffaireService;


@RestController
@CrossOrigin(origins = "*")
public class AffaireController {
	@Autowired
	IAffaireService affaireService;
	
	
	@RequestMapping(value="affaire", method = RequestMethod.POST)
	public void saveAffaire(@RequestBody Affaire affaire) {
		affaireService.save(affaire);
	}
	
	@RequestMapping(value="affaire")
	public List<Affaire> findAllAffaire () {
		return affaireService.findAll(Affaire.class);
	}
	
	@RequestMapping(value="affaire/{titre}")
	public Affaire getAffaireByTitre(@PathVariable("titre") String titre) {
		return affaireService.getAffaireByTitre(titre);
		
	}

}
