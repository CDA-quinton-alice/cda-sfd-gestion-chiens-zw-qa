package fr.afpa.service;

import java.util.List;

import fr.afpa.pojo.Chien;

public interface ChienService {
	/**
	 * add a dog
	 * 
	 * @param chien
	 */
	public void addChien(Chien chien);

	/**
	 * delete a dog by id
	 * 
	 * @param id
	 */
	public void deleteChienById(Integer id);

	/**
	 * update information of a dog
	 * 
	 * @param chien
	 */
	public void updateChien(Chien chien);

	/**
	 * show all the dogs
	 * 
	 * @return
	 */
	public List<Chien> queryChiens();
}
