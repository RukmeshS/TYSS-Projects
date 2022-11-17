package com.ty.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.dao.StudentDao;
import com.ty.dto.Student;
@WebServlet("/Login")
public class LoginController extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	
	
	StudentDao dao = new StudentDao();
	String email = req.getParameter("email");
	String password = req.getParameter("password");
	HttpSession httpSession =req.getSession();
	httpSession.setAttribute("email", email);
	
	
	Student student = dao.findbyemail(email);
	
	if (student.getPassword().equals(password)) 
	{
	RequestDispatcher dispatcher = req.getRequestDispatcher("View.jsp");
	dispatcher.forward(req, resp);
	}
	else
	{
		req.setAttribute("invalid", "Invalid Password");
		RequestDispatcher dispatcher = req.getRequestDispatcher("Login.jsp");
		dispatcher.forward(req, resp);
		
	}
	
}

@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
}
