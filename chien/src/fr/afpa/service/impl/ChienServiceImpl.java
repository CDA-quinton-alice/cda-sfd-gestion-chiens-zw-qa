package fr.afpa.service.impl;

import java.util.List;

import fr.afpa.dao.ChienDao;
import fr.afpa.dao.impl.ChienDaoImpl;
import fr.afpa.pojo.Chien;
import fr.afpa.service.ChienService;

public class ChienServiceImpl implements ChienService {

	private ChienDao chienDao = new ChienDaoImpl();

	@Override
	public void addChien(Chien chien) {
		chienDao.addChien(chien);

	}

	@Override
	public void deleteChienById(Integer id) {
		chienDao.deleteChienById(id);
	}

	@Override
	public void updateChien(Chien chien) {
		chienDao.updateChien(chien);
	}

	@Override
	public List<Chien> queryChiens() {
		return chienDao.queryChiens();
	}

}
