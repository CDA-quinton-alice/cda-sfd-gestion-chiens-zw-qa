package fr.afpa.dao.impl;

import fr.afpa.dao.UserDao;
import fr.afpa.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public User queryUserByUsername(String username) {
		String sql = "select idPersonne, username, pwd, email from personne where username = ?";
		return queryForOne(User.class, sql, username);
	}

	@Override
	public User queryUserByUsernameAndPassword(String username, String password) {
		String sql = "select idPersonne, username, pwd, email from personne where username = ? and pwd = ?";
		return queryForOne(User.class, sql, username, password);
	}

	@Override
	public int saveUser(User user) {
		String sql = "insert into personne(username, pwd, email) values(?,?,?)";
		return update(sql, user.getUsername(), user.getPwd(), user.getEmail());
	}

}
