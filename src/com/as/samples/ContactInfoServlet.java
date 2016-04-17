package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="/ContactInfoServlet", urlPatterns = { "/ContactInfoServlet" })
public class ContactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String address = request.getParameter("address");
		String cityName = request.getParameter("city");
		String stateName = request.getParameter("state");
		String countryName = request.getParameter("country");
		int contactNo = Integer.parseInt(request.getParameter("contact"));

		HttpSession ses = request.getSession();

		ses.setAttribute("oaddress", address);
		ses.setAttribute("ocity", cityName);
		ses.setAttribute("ostate", stateName);
		ses.setAttribute("ocountry", countryName);
		ses.setAttribute("ocontact", contactNo);

		response.setContentType("text/html");
		response.sendRedirect("html/bankinfo1.html");

	}

}
