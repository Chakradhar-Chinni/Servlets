package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;    
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  
import java.io.IOException;

public class AServlet extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		HttpSession session = req.getSession();
		int a = 1912;
		int b = 1913;
		int c = 1914;
		session.setAttribute("a",a);
		session.setAttribute("b",b);
		session.setAttribute("c",c);
		res.sendRedirect("bservlet");
	}
}
