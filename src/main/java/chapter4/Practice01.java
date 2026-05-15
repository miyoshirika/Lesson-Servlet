package chapter4;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns= {"/chapter4/practice01"})
public class Practice01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Practice01() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/plain; charset=UTF-8");
		
		PrintWriter out=response.getWriter();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
		
		out.println("現在の時刻は:"+format.format(new java.util.Date())+"です");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
