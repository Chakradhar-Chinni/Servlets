package com.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;    
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

public class AddServlet extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out = res.getWriter(); 
    
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("database");
    
    out.println("Param Value: "+ str);
		
	}
}
