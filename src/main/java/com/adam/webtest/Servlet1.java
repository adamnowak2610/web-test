package com.adam.webtest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "Servlet1"
        , urlPatterns = { "/test" }
)
public class Servlet1 extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        Integer x = Integer.valueOf(req.getParameter("x"));
        Integer y = Integer.valueOf(req.getParameter("y"));

        PrintWriter out = res.getWriter();
        out.println(x + y);

    }

}
