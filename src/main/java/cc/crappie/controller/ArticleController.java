package cc.crappie.controller;

import cc.crappie.entity.Article;
import cc.crappie.service.ArticleService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ArticleController extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        List<Article> articles = new ArticleService().retrieve(1L);
        request.setAttribute("articles", articles);
        response.setContentType("text/html; charset=utf-8");
        try {
            request.getRequestDispatcher("articles.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
