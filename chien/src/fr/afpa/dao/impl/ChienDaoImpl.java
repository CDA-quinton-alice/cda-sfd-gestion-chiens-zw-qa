package fr.afpa.dao.impl;

import java.util.List;

import fr.afpa.dao.ChienDao;
import fr.afpa.pojo.Chien;

public class ChienDaoImpl extends BaseDao implements ChienDao {

	@Override
	public int addChien(Chien chien) {
		String sql = "insert into chien(puce,nom,couleur,age,imgPath) values(?,?,?,?,?)";
		return update(sql, chien.getPuce(), chien.getNom(), chien.getCouleur(), chien.getAge(), chien.getImgPath());
	}

	@Override
	public int deleteChienById(Integer id) {
		String sql = "delete from chien where id = ?";
		return update(sql, id);
	}

	@Override
	public int updateChien(Chien chien) {
		String sql = "update chien set puce=?,nom=?,couleur=?,age=?,imgPath=? where idChien = ?";
		return update(sql, chien.getPuce(), chien.getNom(), chien.getCouleur(), chien.getAge(), chien.getImgPath(),
				chien.getIdChien());
	}

	@Override
	public Chien queryChienById(Integer id) {
		String sql = "select idChien,puce,nom,couleur,age, imgPath from chien where idChien = ?";
		return queryForOne(Chien.class, sql, id);
	}

	@Override
	public List<Chien> queryChiens() {
		String sql = "select idChien,puce,nom,couleur,age, imgPath from chien";
		return queryForList(Chien.class, sql);
	}

}
