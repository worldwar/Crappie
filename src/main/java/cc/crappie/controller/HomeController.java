package cc.crappie.controller;

import cc.crappie.service.AuthorService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class HomeController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        AuthorService service = new AuthorService();
        request.setAttribute("authors", service.retrieve());
        try {
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
