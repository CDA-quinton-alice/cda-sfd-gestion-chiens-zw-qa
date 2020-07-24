package fr.afpa.service;

import fr.afpa.pojo.User;

public interface UserService {
	/**
	 * register user
	 * 
	 * @param user
	 */
	public void registUser(User user);

	/**
	 * user login
	 * 
	 * @param user
	 * @return
	 */
	public User login(User user);

	/**
	 * check if this username has been taken
	 * 
	 * @param username
	 * @return
	 */
	public boolean existsUsername(String username);
}
