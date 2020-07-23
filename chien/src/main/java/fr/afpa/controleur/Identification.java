package fr.afpa.controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns = {"/identification.fr","/identification.html","/identification","/"})
public class Identification extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Identification() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/src/main/webapp/Identification.jsp").forward(request, response);
		// on veut arriver sur la jsp identification
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/src/main/webapp/index.jsp").forward(request, response);
		this.getServletContext().getRequestDispatcher("/src/main/webapp/Inscription.jsp").forward(request, response);
	}

}
