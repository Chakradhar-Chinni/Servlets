package com.data;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet
	{
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
		{
			int i = Integer.parseInt(req.getParameter("num1"));
			int j = Integer.parseInt(req.getParameter("num2"));
			
			int k = i+j;
			
			req.setAttribute("k",k);
			//PrintWriter out = res.getWriter();
			//out.println("Result is: "+ k);
			
			//calling sqservlet from AddServlet
			RequestDispatcher rd = req.getRequestDispatcher("sq");
			rd.forward(req, res);
		}

	}
/*
while using RequestDispatcher we use setAttribute and getAttribute
while using sendRedirect we use req & res objects
*/
