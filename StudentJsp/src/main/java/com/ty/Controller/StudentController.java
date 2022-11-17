package com.ty.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.StudentDao;
import com.ty.dto.Student;



@WebServlet("/Signup")
public class StudentController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Student student =  new Student();
		student.setName(req.getParameter("name"));
		student.setPhone(Long.parseLong(req.getParameter("phone")));
		student.setEmail(req.getParameter("email"));
		student.setPassword(req.getParameter("password"));
		
		StudentDao dao =new StudentDao();
		dao.save(student);
		
		req.setAttribute("message", "Successfully Signed in");
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("Signup.jsp");
		dispatcher.forward(req, resp);
		
		
			
	}
}
