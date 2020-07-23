package fr.afpa.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.service.PersonneService;

public class RegistServlet extends HttpServlet {

	private PersonneService personneService = new PersonneService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");

		if (personneService.existsUsername(username)) {
			System.out.println("username[" + username + "]already exists!");

			req.setAttribute("msg", "username already taken");
			req.setAttribute("username", username);
			req.setAttribute("email", email);

			req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
		} else {
			// 可用
//                调用Sservice保存到数据库
			userService.registUser(new User(null, username, password, email));
//
//        跳到注册成功页面 regist_success.jsp
			req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req, resp);
		}
		// 把回显信息，保存到Request域中
		req.setAttribute("msg", "验证码错误！！");
		req.setAttribute("username", username);
		req.setAttribute("email", email);

		System.out.println("验证码[" + code + "]错误");
		req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
	}

}
