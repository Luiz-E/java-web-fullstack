package org.example.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.model.Login;

import java.io.IOException;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletLogin(){};

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String senha = req.getParameter("senha");

        if (login != null && !login.isEmpty() && senha != null && !senha.isEmpty()) {
            Login modelLogin = new Login(login, senha);
        } else {
            RequestDispatcher redirecionar = req.getRequestDispatcher("index.jsp");
            req.setAttribute("msg", "Informe o login e senha corretamente");
            redirecionar.forward(req, resp);
        }
    }
}
