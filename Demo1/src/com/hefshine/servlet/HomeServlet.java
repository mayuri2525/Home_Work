package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException { 
	
		PrintWriter pw=res.getWriter();
		pw.print("hello from servlet");
		
		//String s=req.getParameter("username");
		//System.out.println(s+ "home servlet");
		//pw.print(s+ "home servlet");
		
		
	}

}
