package servletTest;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact
 */
@WebServlet(urlPatterns={"/contact"})
	public class Contact extends HttpServlet {
	
       

	public void doPost(
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		request.getRequestDispatcher("contactForward.jsp")
				.forward(request, response);		
		

	}

}
