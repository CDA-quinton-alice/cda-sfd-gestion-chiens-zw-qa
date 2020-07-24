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
import fr.afpa.utils.WebUtils;

/**
 * Servlet implementation class DogServlet
 */
@WebServlet("/ChienServlet")
public class ChienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ChienService chienService = new ChienServiceImpl();

	protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = WebUtils.parseInt(req.getParameter("id"), 0);
		chienService.deleteChienById(id);
		resp.sendRedirect(req.getContextPath() + "/ChienServlet");
	}

	protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Chien chien = WebUtils.copyParamToBean(req.getParameterMap(), new Chien());
		chienService.updateChien(chien);
		resp.sendRedirect(req.getContextPath() + "/ChienServlet");
	}

	protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Chien> chiens = chienService.queryChiens();
		req.setAttribute("chiens", chiens);
		req.getRequestDispatcher("/pages/dog.jsp").forward(req, resp);
	}
}