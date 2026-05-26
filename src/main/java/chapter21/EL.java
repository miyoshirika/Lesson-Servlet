package chapter21;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import bean.Product;

/**
 * Servlet implementation class EL
 */
@WebServlet(urlPatterns={"/chapter21/el"})
public class EL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
			
			Product p=new Product();
			p.setId(1);
			p.setName("まぐろ");
			p.setPrice(100);
			
			request.setAttribute("product", p);
			
			request.getRequestDispatcher("el.jsp")
			.forward(request, response);
		}

	}
