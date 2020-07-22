package fr.afpa.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fr.afpa.bean.Personne;
import fr.afpa.dao.PersonneDao;

@Repository
public class PersonneDaoImpl implements PersonneDao {

	@Autowired
	private JdbcTemplate jdbcTemplet;

	@Override
	public void add(Personne personne) {
		String sql = "insert into personne(login,mdp,email) values(?,?,?)";
		int update = jdbcTemplet.update(sql, personne.getLogin(), personne.getMdp(), personne.getEmail());
		System.out.println(update);
	}

	@Override
	public void update(Personne personne) {
		String sql = "update personne set login=?, mdp=?, email=? where idPersonne=?";
		int update = jdbcTemplet.update(sql, personne.getLogin(), personne.getMdp(), personne.getEmail(),
				personne.getIdPersonne());
		System.out.println(update);
	}

	@Override
	public void delete(int id) {
		String sql = "delete from personne where idPersonne=?";
		int update = jdbcTemplet.update(sql, id);
		System.out.println(update);

	}

	@Override
	public int count() {
		String sql = "select count(*) from personne";
		Integer count = jdbcTemplet.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public Personne find(int id) {
		String sql = "select * from personne where idPersonne=?";
		Personne personne = jdbcTemplet.queryForObject(sql, new BeanPropertyRowMapper<Personne>(Personne.class), id);
		return personne;
	}

	@Override
	public List<Personne> findAll() {
		String sql = "select * from personne";
		List<Personne> list = jdbcTemplet.query(sql, new BeanPropertyRowMapper<Personne>(Personne.class));
		return list;
	}

}
