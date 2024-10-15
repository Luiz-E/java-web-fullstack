package org.example.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = {"/principal/*"})
public class FilterAutenticacao implements Filter{

    public FilterAutenticacao(){}

    public void destroy(){};
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpReq = (HttpServletRequest) req;
        HttpSession session = httpReq.getSession();
        String usuarioLogado = (String) session.getAttribute("usuario");
        String urlParaAutenticar = httpReq.getServletPath();

        if (
                usuarioLogado == null &&
                !urlParaAutenticar.equalsIgnoreCase("/principal/ServletLogin"))
        {
            RequestDispatcher redireciona = req.getRequestDispatcher("/index.jsp?url=" + urlParaAutenticar);
            req.setAttribute("msg", "Por favor realize o login.");
            redireciona.forward(req, resp);
            return;
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig fConfig) throws ServletException {

    }

}
