package fr.afpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.bean.Personne;
import fr.afpa.dao.PersonneDao;

@Service
public class PersonneService {

	@Autowired
	private PersonneDao personneDao;

	public void addPersonne(Personne personne) {
		personneDao.add(personne);
	}

}
