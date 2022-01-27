package com.ty.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.StudentDao;

public class DeleteStudentDao extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	
		String id=req.getParameter("id");
		int parsedid=Integer.parseInt(id);
		StudentDao dao=new StudentDao();
		boolean result=dao.deleteStudent(parsedid);
		PrintWriter pw=resp.getWriter();
		if(result==true)
		  pw.println("Student deleted");
		else
			pw.println("Student not deleted");
			
	}
	

}
