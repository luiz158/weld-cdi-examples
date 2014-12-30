package com.cdi.chapter2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdi.chapter2.model.Account;
import com.cdi.chapter2.qualifier.Administrator;
import com.cdi.chapter2.qualifier.UserAccount;

@WebServlet("/account")
public class ServletAccount extends HttpServlet {

	private static final long serialVersionUID = -1107410638138302111L;

	@Inject
	@UserAccount
	private Account account;

	@Inject
	@Any
	private Instance<Account> accounts;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println(account.print()); //user account

		Instance<Account> select = accounts.select(new AnnotationLiteral<Administrator>() {
			private static final long serialVersionUID = -9168249564611983775L;});

		Account accountAdmin = select.get();
		out.println(accountAdmin.print());
	}
}
