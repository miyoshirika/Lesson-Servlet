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
 * Servlet implementation class Board
 */
@WebServlet(urlPatterns={"/chapter14/board"})
public class Board extends HttpServlet {
	public void doGet(
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		Page.header(out);
		try {
			InitialContext ic=new InitialContext();
			DataSource ds=(DataSource)ic.lookup(
				"java:/comp/env/jdbc/book");
			Connection con=ds.getConnection();
			
			PreparedStatement st=con.prepareStatement(
				"select * from posts");
			ResultSet rs=st.executeQuery();
			
			while (rs.next()) {
				out.println(rs.getString("name"));
				out.println(":");
				out.println(rs.getTimestamp("post_date"));
				out.println("<br>");
				out.println(rs.getString("content"));
				out.println("<br>");
			}
			
			st.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}
	
	public void doPost(
			HttpServletRequest request, HttpServletResponse response
		) throws ServletException, IOException {
		
			PrintWriter out=response.getWriter();
		
			try {
				InitialContext ic=new InitialContext();
				DataSource ds=(DataSource)ic.lookup(
					"java:/comp/env/jdbc/book");
				Connection con=ds.getConnection();
				
				
				String name=request.getParameter("name");
				String content=request.getParameter("content");
				
				PreparedStatement st=con.prepareStatement(
					"insert into posts(name,content,post_date) values(?,?,now())");
				st.setString(1, name);
				st.setString(2, content);
				st.executeUpdate();
				
		        st.close();
		        con.close();
		        
		        response.sendRedirect("board");
				
			}catch (Exception e) {
				throw new ServletException(e);
			}
	}


}