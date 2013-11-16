package cc.crappie.controller;

import cc.crappie.entity.Author;
import cc.crappie.mapper.AuthorMapper;
import cc.crappie.service.AuthorService;
import cc.crappie.util.RequestUtil;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpController extends HttpServlet {

    private AuthorService authorService = new AuthorService();

    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response){
        Author author = RequestUtil.author(request);
        authorService.insert(author);
    }

}
