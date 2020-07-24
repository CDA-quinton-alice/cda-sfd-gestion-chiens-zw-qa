package fr.afpa.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.afpa.pojo.Chien;
import fr.afpa.service.ChienService;
import fr.afpa.service.impl.ChienServiceImpl;

/**
 * Servlet implementation class DogServlet
 */
@WebServlet("/ChienServlet")
public class ChienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ChienService chienService = new ChienServiceImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Chien> chiens = chienService.queryChiens();
		System.out.println(chiens);
		req.setAttribute("chiens", chiens);
		req.getRequestDispatcher("/pages/dog.jsp").forward(req, resp);
	}

}