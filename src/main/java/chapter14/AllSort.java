package chapter14;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class AllSort
 */
@WebServlet(urlPatterns={"/chapter14/all-sort"})
public class AllSort extends HttpServlet {
	public void doGet(
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		Page.header(out);
		try {
			String sort = request.getParameter("sort");
			
			String order = "price ASC";
			if("high".equals(sort)) {
				order = "price DESC";
			}
			out.println("<form action=\"all-sort\" method=\"get\">");
			out.println("<button type=\"submit\" name=\"sort\" value=\"high\">価格が高い順</button>");
			out.println("<button type=\"submit\" name=\"sort\" value=\"low\">価格が安い順</button>");
			out.println("</form>");
			out.println("<hr>");
			
			InitialContext ic=new InitialContext();
			DataSource ds=(DataSource)ic.lookup(
				"java:/comp/env/jdbc/book");
			Connection con=ds.getConnection();
			
			String sql = "SELECT * FROM product ORDER BY " + order;
			PreparedStatement st=con.prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			
			
			while (rs.next()) {
				out.println(rs.getInt("id"));
				out.println(":");
				out.println(rs.getString("name"));
				out.println(":");
				out.println(rs.getInt("price"));
				out.println("<br>");
			}
			
			st.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}


}