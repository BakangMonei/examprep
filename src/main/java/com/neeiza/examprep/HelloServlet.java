package com.neeiza.examprep;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ResultSet res = null;
        response.setContentType("text/html");
        String username = request.getParameter("userid");
        String password = request.getParameter("password");

        DAO dao = new DAO();
        try {
            res = dao.login(username, password);
            if(res.next()){
                //Only If Credentials == true
                User user = new User();
                System.out.println("Welcome User");
                user.setUsername(res.getString(1));
                System.out.println(user.getUsername());
                response.sendRedirect(request.getContextPath() + "/welcome.jsp");
            }
            else {
                System.out.println("Incorrect Login");
                response.sendRedirect(request.getContextPath() + "/wrong.jsp");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}