package cc.crappie.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharsetFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        System.out.println("blahblah");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
