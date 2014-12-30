package com.cdi.chapter2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdi.chapter2.model.ApplicationBean;

@WebServlet("/application-bean")
public class ServletApplicationBean extends HttpServlet {

	private static final long serialVersionUID = -6843159156684772692L;

	@Inject
	private ApplicationBean applicationBean;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println(applicationBean.print());
	}
}
