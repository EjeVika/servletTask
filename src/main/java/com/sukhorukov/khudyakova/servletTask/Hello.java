package com.sukhorukov.khudyakova.servletTask;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**

 */
@WebServlet( name = "SimpleServlet", urlPatterns = {"/simple"} )
public class Hello extends HttpServlet {
    private static final Logger log = Logger.getLogger(Hello.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    //    resp.getOutputStream().println("Hello");


        List<Integer> list = new ArrayList<>();
        for(Integer i=0;i<=10;i++){
            list.add(i);
        }

        req.setAttribute("list",list);
        req.getRequestDispatcher("/WEB-INF/test.jsp").forward(req, resp);
    }
}
