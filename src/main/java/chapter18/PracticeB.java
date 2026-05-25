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
 * Servlet implementation class PracticeB
 */
@WebServlet(urlPatterns={"/chapter18/practice-b"})
public class PracticeB extends HttpServlet {
	public void doPost(
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);
		
		String username = request.getParameter("username");
		
		Cookie cookie = new Cookie("user", username);
		cookie.setMaxAge(300); // 5分
		response.addCookie(cookie);
		
		out.println("<p>クッキーを保存しました：" + username + "</p>");
		
		Page.footer(out);
    }
}
