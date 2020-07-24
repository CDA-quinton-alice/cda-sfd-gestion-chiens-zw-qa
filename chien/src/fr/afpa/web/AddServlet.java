package fr.afpa.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.pojo.Chien;
import fr.afpa.service.ChienService;
import fr.afpa.service.impl.ChienServiceImpl;
import fr.afpa.utils.WebUtils;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ChienService chienService = new ChienServiceImpl();
	Chien ch = new Chien();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		int puce = WebUtils.parseInt(request.getParameter("puce"), 0);
		String couleur = request.getParameter("couleur");
		int age = WebUtils.parseInt(request.getParameter("age"), 0);
		String imgPath = request.getParameter("imgPath");

		chienService.addChien(new Chien(null, puce, nom, couleur, age, imgPath));
		response.sendRedirect(request.getContextPath() + "/ChienServlet");
	}

}
