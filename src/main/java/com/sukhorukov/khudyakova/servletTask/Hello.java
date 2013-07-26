package com.sukhorukov.khudyakova.servletTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**

 */
@WebServlet( name = "SimpleServlet", urlPatterns = {"/simple"} )
public class Hello extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getOutputStream().println("Hello");
        req.getRequestDispatcher("/WEB-INF/test.jsp").forward(req, resp);
    }
}
