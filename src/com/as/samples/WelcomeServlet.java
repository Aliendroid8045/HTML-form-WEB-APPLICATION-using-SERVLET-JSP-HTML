package com.as.samples;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String middleName = request.getParameter("mname");
		
		
		HttpSession ses = request.getSession();
		

		ses.setAttribute("ofname", firstName);
		ses.setAttribute("olname", lastName);
		ses.setAttribute("omname", middleName);
		response.setContentType("text/html");
		response.sendRedirect("html/contactinfo1.html");

	}

}
