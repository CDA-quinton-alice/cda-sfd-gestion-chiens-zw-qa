package fr.afpa.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.dao.ChienDao;
import fr.afpa.dao.impl.ChienDaoImpl;
import fr.afpa.pojo.Chien;
import fr.afpa.service.ChienService;
import fr.afpa.service.impl.ChienServiceImpl;
import fr.afpa.utils.WebUtils;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ChienService chienService = new ChienServiceImpl();
	ChienDao chienDao = new ChienDaoImpl();
	Chien ch = new Chien();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
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
		int id = WebUtils.parseInt(request.getParameter("idChien"), 0);
		ch = chienDao.queryChienById(id);
		System.out.println(ch);
		request.setAttribute("ch", ch);
		this.getServletContext().getRequestDispatcher("/pages/update_dog.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nom = request.getParameter("nom");
		int puce = WebUtils.parseInt(request.getParameter("puce"), 0);
		String couleur = request.getParameter("couleur");
		int age = WebUtils.parseInt(request.getParameter("age"), 0);
		String imgPath = request.getParameter("imgPath");

		System.out.println(ch);
		Chien wouf = new Chien(ch.getIdChien(), puce, nom, couleur, age, imgPath);
		chienService.updateChien(new Chien(ch.getIdChien(), puce, nom, couleur, age, imgPath));
		response.sendRedirect(request.getContextPath() + "/ChienServlet");
	}

}
