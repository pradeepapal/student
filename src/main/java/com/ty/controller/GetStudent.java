package com.ty.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.StudentDao;
import com.ty.dto.Student;

public class GetStudent extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		resp.getWriter().println(id);

		StudentDao dao = new StudentDao();
		Student student = dao.getStudentById(Integer.parseInt(id));
		req.setAttribute("mystudents", student);
		RequestDispatcher dispatcher = req.getRequestDispatcher("Edit.jsp");
		dispatcher.forward(req, resp);

	}
	


}
