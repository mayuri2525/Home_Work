package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hefshine.employee.Employee;
import com.hefshine.employeedao.EmployeeDao;

public class DemoServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		//System.out.println(username);
		PrintWriter out=res.getWriter();
		EmployeeDao dao =new EmployeeDao();
		Employee emp=new Employee(username,password);
		if(dao.checkUsername(emp)) { 
			out.print("welcome: " +username);
			RequestDispatcher rd=req.getRequestDispatcher("/HomeServlet");
			rd.forward(req, res);
		}
		
		else {
			out.print("sorry username not found");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
		
		//System.out.println("hello");
	}

}


