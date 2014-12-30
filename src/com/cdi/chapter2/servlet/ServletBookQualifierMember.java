package com.cdi.chapter2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdi.chapter2.model.Book;
import com.cdi.chapter2.model.Category;
import com.cdi.chapter2.model.SearchBook;

@WebServlet(urlPatterns = {"/book"})
public class ServletBookQualifierMember extends HttpServlet {

	private static final long serialVersionUID = 2491386052189369470L;

	@Inject
	@Book(value = Category.NON_FICTION)
	private SearchBook search;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println(search.search());
	}
}
