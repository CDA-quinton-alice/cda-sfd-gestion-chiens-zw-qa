package fr.afpa.controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import fr.afpa.bean.Personne;
import fr.afpa.service.PersonneService;

@WebServlet (urlPatterns = {"/inscription.fr","/inscription.html","inscription.com","/identification","/wouf.fr/inscription", "/wouf.com/inscription", "/wouf.fr/inscription.html", "/wouf.com/inscription.html"})
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Inscription() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("src/main/webapp/Inscription.jsp").forward(request, response);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String login = request.getParameter("login").toLowerCase();
		String mdp = request.getParameter("mdp");
		String email = request.getParameter("email").toLowerCase();
		Personne p = new Personne(login,mdp,email);


	}

}
