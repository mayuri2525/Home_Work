package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class DemoServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		//System.out.println(username);
		PrintWriter out=res.getWriter();
		out.print(username);
		
		//System.out.println("hello");
	}

}
