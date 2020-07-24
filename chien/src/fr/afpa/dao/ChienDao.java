package fr.afpa.dao;

import java.util.List;

import fr.afpa.pojo.Chien;

public interface ChienDao {

	public int addChien(Chien chien);

	public int deleteChienById(Integer id);

	public int updateChien(Chien chien);

	public Chien queryChienById(Integer id);

	public List<Chien> queryChiens();

//    Integer queryForPageTotalCount();
//
//    List<Chien> queryForPageItems(int begin, int pageSize);
//
//    Integer queryForPageTotalCountByPrice(int min, int max);
//
//    List<Chien> queryForPageItemsByPrice(int begin, int pageSize, int min, int max);

}
