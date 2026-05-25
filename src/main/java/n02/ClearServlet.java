package n02;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet(urlPatterns={"/n02/clear-servlet"})
public class ClearServlet extends HttpServlet {

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		session.removeAttribute("list");
		
		request.getRequestDispatcher("favorites.jsp")
		.forward(request, response);
		
	}

}
