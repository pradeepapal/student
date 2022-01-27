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
import com.ty.dto.User;

public class CreateStudentServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		int age = Integer.parseInt(req.getParameter("age"));
		long phone = Long.parseLong(req.getParameter("phone"));

		Student student = new Student();
		student.setAge(age);
		student.setEmail(email);
		student.setGender(gender);
		student.setName(name);
		student.setPhone_no(phone);
		

		StudentDao dao = new StudentDao();
		if (dao.saveStudent(student)) {
			PrintWriter writer = resp.getWriter();
			writer.println("Student added");
		} else {

			PrintWriter writer = resp.getWriter();
			writer.println("Student not added");
		}


		RequestDispatcher dispatcher = req.getRequestDispatcher("Display.jsp");
		dispatcher.include(req, resp);
		
	}

}
