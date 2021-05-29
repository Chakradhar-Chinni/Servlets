package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class BServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws  IOException
	{
		HttpSession session = req.getSession();
		PrintWriter out = res.getWriter();      
		
		int a = (int) session.getAttribute("a"); 		//Data will be fetched in object format, so we typecast the object data to required datatype
		int b = (int) session.getAttribute("b");
		int c = (int) session.getAttribute("c");
                                     
		out.println("A: "+a);
		out.println("B: "+b);
		out.println("C: "+c);
		//session.removeAttribute("a");
		int k = (int) session.getAttribute("a");
		out.println("K: "+k);
	}
}
 
