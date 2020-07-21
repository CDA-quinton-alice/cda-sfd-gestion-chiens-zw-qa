package fr.afpa.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
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
		String sql = "insert into personne(`login`,`password`,`email`) values(?,?,?)";
		int update = jdbcTemplet.update(sql, personne.getLogin(), personne.getPassword(), personne.getEmail());
		System.out.println(update);
	}

}
