package fr.afpa.service.impl;

import fr.afpa.dao.UserDao;
import fr.afpa.dao.impl.UserDaoImpl;
import fr.afpa.pojo.User;
import fr.afpa.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();

	@Override
	public void registUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	public User login(User user) {
		return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPwd());
	}

	@Override
	public boolean existsUsername(String username) {
		if (userDao.queryUserByUsername(username) == null) {
			return false;
		}
		return true;
	}

}
