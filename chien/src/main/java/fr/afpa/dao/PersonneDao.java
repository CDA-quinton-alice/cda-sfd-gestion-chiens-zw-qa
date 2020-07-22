package fr.afpa.dao;

import java.util.List;

import fr.afpa.bean.Personne;

public interface PersonneDao {

	public void add(Personne personne);

	public void update(Personne personne);

	public void delete(int id);

	public int count();

	public Personne find(int id);

	public List<Personne> findAll();

}
