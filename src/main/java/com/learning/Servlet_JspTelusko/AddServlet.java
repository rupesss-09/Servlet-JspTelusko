package com.learning.Servlet_JspTelusko;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;

//      PrintWriter out = resp.getWriter();
//      out.println("Result is now:" + k);
//      resp.getWriter().println("Result is :" + k);

//      We have to set attribute, so that we can send some value to another servlet. We can do that by setting attribute.
        req.setAttribute("k", k);
        RequestDispatcher rd = req.getRequestDispatcher("sq");
        rd.forward(req, resp);
    }

}