package chapter15;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import bean.PracticeBean;
import dao.PracticeDAO;


@WebServlet(urlPatterns={"/chapter15/practice"})
public class Practice extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String sort = request.getParameter("sort");

            String order = "price ASC";
            if ("high".equals(sort)) {
                order = "price DESC";
            }

            PracticeDAO dao = new PracticeDAO();
            List<PracticeBean> list = dao.findAll(order);

            request.setAttribute("products", list);

            request.getRequestDispatcher("/chapter15/practice.jsp")
                   .forward(request, response);

        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}