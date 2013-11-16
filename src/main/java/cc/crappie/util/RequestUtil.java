package cc.crappie.util;

import cc.crappie.entity.Author;

import javax.servlet.http.HttpServletRequest;

public class RequestUtil {
    public static Author author(HttpServletRequest request) {
        return new Author()
                .setEmail(request.getParameter("email"))
                .setName(request.getParameter("name"))
                .setPassword(request.getParameter("password"));
    }
}
