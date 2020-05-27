import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilmesServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		List<String> filmes = new ArrayList<>();
		filmes.add("Titanic");
		filmes.add("Homens de preto");
		filmes.add("Em busca da felicidade");
		
		request.setAttribute("filmes", filmes);
		
		RequestDispatcher rd = request.getRequestDispatcher("filmes.jsp");
		rd.forward(request, response);
		
	}
	
}