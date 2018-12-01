package com.adam.webtest;

import javax.servlet.RequestDispatcher;
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
            throws IOException, ServletException {

        Integer a = Integer.valueOf(req.getParameter("x"));
        Integer b = Integer.valueOf(req.getParameter("y"));
        Integer c = Integer.valueOf(req.getParameter("z"));

        req.setAttribute("result", Math.pow(((a + b) * c),(2)));

        req.setAttribute("krok",((("("+((req.getParameter("x")))+"+"+(req.getParameter("y"))+")")+"*"+(req.getParameter("z")))+"^2"));

        RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
        rd.forward(req, res);

    }

}
