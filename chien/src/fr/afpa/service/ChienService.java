package fr.afpa.service;

import java.util.List;

import fr.afpa.pojo.Chien;

public interface ChienService {
	public void addChien(Chien chien);

	public void deleteChienById(Integer id);

	public void updateChien(Chien chien);

	public List<Chien> queryChiens();
}
