package com.ty.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.StudentDao;
import com.ty.dto.Student;

public class EditStudentServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Student student = new Student();

		String id = req.getParameter("id");
		String name = req.getParameter("username");
		String email = req.getParameter("email");
		String age = req.getParameter("age");
		String password = req.getParameter("password");
		String phone = req.getParameter("phone");

		student.setId(Integer.parseInt(id));
		student.setAge(Integer.parseInt(age));
		student.setEmail(email);
		student.setGender(age);
		student.setPhone_no(Long.parseLong(phone));
		student.setName(name);

		StudentDao dao = new StudentDao();
		dao.updateStudent(student);

		PrintWriter pw = resp.getWriter();
		pw.println("User Updated");
//
//		RequestDispatcher dispatcher = req.getRequestDispatcher("Display.jsp");
//		dispatcher.forward(req, resp);

	}

}
