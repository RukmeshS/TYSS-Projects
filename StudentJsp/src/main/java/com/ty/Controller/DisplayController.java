package com.ty.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.StudentDao;
import com.ty.dto.Student;


@WebServlet("/View")
public class DisplayController extends HttpServlet{



@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doPost(req, resp);
	}
	
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	    StudentDao dao = new StudentDao();
		List<Student> list = dao.getallstudent();
		req.setAttribute("students", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("View.jsp");
		dispatcher.forward(req, resp);

}


}