package org.example.servlets;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.dao.DAOUsuarioRepository;
import org.example.model.Login;

import java.io.IOException;

@WebServlet(urlPatterns = {"/ServletUsuarioController"})
public class ServletUsuarioController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private DAOUsuarioRepository daoUsuarioRepository = new DAOUsuarioRepository();
    public ServletUsuarioController() {}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        Login modelLogin = new Login(nome, email, login, senha);
        modelLogin.setId((id != null && !id.isEmpty()) ? Long.parseLong(id) : null);

        try {
            modelLogin = daoUsuarioRepository.gravarUsuario(modelLogin);
            request.setAttribute("msg", "Operação realizadad com sucesso!");
            request.setAttribute("modelLogin", modelLogin);
            request.getRequestDispatcher("principal/usuario.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("msg", e.getMessage());
            request.getRequestDispatcher("erro.jsp").forward(request, response);
        }
    }
}
