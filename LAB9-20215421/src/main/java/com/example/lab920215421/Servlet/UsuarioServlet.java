package com.example.lab920215421.Servlet;

import com.example.lab920215421.Beans.Usuario;
import com.example.lab920215421.Daos.UsuarioDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name="UsuarioServlet",value="/UsuarioServlet")
public class UsuarioServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        String action=request.getParameter("action")==null? "lista":request.getParameter("action");
        UsuarioDao usuarioDao= new UsuarioDao();
        switch(action){
            case "lista":
                ArrayList<Usuario> lista= usuarioDao.listarUsuario();
                request.setAttribute("lista",lista);
                RequestDispatcher rd= request.getRequestDispatcher("JSP/vistaUsuarios.jsp");
                rd.forward(request,response);
                break;
        }
    }
}
