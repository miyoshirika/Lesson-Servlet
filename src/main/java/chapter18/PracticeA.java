package chapter18;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class PracticeA
 */
@WebServlet(urlPatterns={"/chapter18/practice-a"})
public class PracticeA extends HttpServlet {
	public void doGet(
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);
		
		Cookie[] cookies=request.getCookies();
		boolean found = false;
		
		if(cookies!=null) {
			for (Cookie cookie : cookies) {
				if ("user".equals(cookie.getName())) {
                    String user = cookie.getValue();
                    out.println("<p>" + user + "</p>");
                    found = true;
                }
			}
		}
		if (!found) {
			out.println("クッキーが見つかりません");
		}
		
		Page.footer(out);
	}

}
