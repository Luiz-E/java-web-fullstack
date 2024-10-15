package org.example.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.example.connection.SingleConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

@WebFilter(urlPatterns = {"/principal/*"})
public class FilterAutenticacao implements Filter{

    private static Connection conn;

    public FilterAutenticacao(){}

    public void destroy(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    };
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        try {
            HttpServletRequest httpReq = (HttpServletRequest) req;
            HttpSession session = httpReq.getSession();
            String usuarioLogado = (String) session.getAttribute("usuario");
            String urlParaAutenticar = httpReq.getServletPath();

            if (
                    usuarioLogado == null &&
                            !urlParaAutenticar.equalsIgnoreCase("/principal/ServletLogin")) {
                RequestDispatcher redireciona = req.getRequestDispatcher("/index.jsp?url=" + urlParaAutenticar);
                req.setAttribute("msg", "Por favor realize o login.");
                redireciona.forward(req, resp);
                return;
            } else {
                chain.doFilter(req, resp);
            }

            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            RequestDispatcher redirecionar = req.getRequestDispatcher("/erro.jsp");
            req.setAttribute("msg", e.getMessage());
            redirecionar.forward(req, resp);
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void init(FilterConfig fConfig) throws ServletException {
        conn = SingleConnection.getConn();
    }

}
