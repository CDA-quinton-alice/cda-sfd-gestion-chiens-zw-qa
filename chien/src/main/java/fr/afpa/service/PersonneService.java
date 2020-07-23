package fr.afpa.service;

import java.util.List;

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

	public void updatePersonne(Personne personne) {
		personneDao.update(personne);
	}

	public void deletePersonne(int id) {
		personneDao.delete(id);
	}

	public int findCount() {
		return personneDao.count();
	}

	public Personne findPersonne(int id) {
		return personneDao.find(id);
	}

	public List<Personne> findAllPersonne() {
		return personneDao.findAll();
	}

	public boolean existsUsername(String username) {
		if (personneDao.find(username) == null) {
			return false;
		}
		return true;
	}

}
