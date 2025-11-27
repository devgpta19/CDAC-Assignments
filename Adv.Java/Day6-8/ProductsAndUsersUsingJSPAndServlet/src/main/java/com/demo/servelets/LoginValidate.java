package com.demo.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Users;
import com.demo.services.LoginService;
import com.demo.services.LoginServiceImpl;

@WebServlet("/validateUser")
public class LoginValidate extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String unm = request.getParameter("unm");
		String pass = request.getParameter("pwd");

		try {
			LoginService lservice = new LoginServiceImpl();
			Users user = lservice.validateUser(unm, pass);
			if (user != null) {
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				RequestDispatcher rd = request.getRequestDispatcher("Category");
				rd.forward(request, response);
			} else {
				out.println("Invalid Credentials");
				RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
				rd.include(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
