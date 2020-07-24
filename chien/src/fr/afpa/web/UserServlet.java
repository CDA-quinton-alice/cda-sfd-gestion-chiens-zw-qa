package fr.afpa.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.pojo.User;
import fr.afpa.service.UserService;
import fr.afpa.service.impl.UserServiceImpl;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService = new UserServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		User loginUser = userService.login(new User(null, username, password, null));

		if (loginUser == null) {
			req.setAttribute("msg", "Wrong username or password");
			req.setAttribute("username", username);
			req.getRequestDispatcher("/pages/login.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("/pages/regist_success.jsp").forward(req, resp);
		}
	}

}
