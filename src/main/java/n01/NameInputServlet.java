package n01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import tool.Page;


@WebServlet(urlPatterns={"/n01/name-input-servlet"})
public class NameInputServlet extends HttpServlet {

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);
		
		String name=request.getParameter("name");
		
		HttpSession session=request.getSession();
		
		session.setAttribute("name", name);
		
		request.getRequestDispatcher("output.jsp")
			.forward(request, response);
		
		Page.footer(out);
	}
}
