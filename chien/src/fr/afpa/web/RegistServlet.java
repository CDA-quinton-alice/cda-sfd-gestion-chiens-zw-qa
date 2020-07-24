package fr.afpa.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.pojo.User;
import fr.afpa.service.UserService;
import fr.afpa.service.impl.UserServiceImpl;

public class RegistServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private UserService userService = new UserServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");

		if (userService.existsUsername(username)) {
			System.out.println(username + "exists");

			req.setAttribute("msg", "Username exisits!");
			req.setAttribute("username", username);
			req.setAttribute("email", email);

			req.getRequestDispatcher("/pages/regist.jsp").forward(req, resp);
		} else {
			userService.registUser(new User(null, username, password, email));
			req.getRequestDispatcher("/pages/regist_success.jsp").forward(req, resp);
		}
	}

}
