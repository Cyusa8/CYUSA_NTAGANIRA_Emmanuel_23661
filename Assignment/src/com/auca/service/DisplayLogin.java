package com.auca.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayLogin extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("name");
        String password = req.getParameter("password");

        
        if ("CYUSA NTAGANIRA Emmanuel".equals(username)) {
           
            try {
                PrintWriter out = res.getWriter();
                out.println("Hello, this is username " + username + " and Password " + password);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
           
            res.sendRedirect("Forget_Password.html"); 
        }
    }
}
