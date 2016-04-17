package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/BankInfoServlet")
public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String bankName = request.getParameter("bankname");
		int accountNo = Integer.parseInt(request.getParameter("accountno"));
		int ssnNo = Integer.parseInt(request.getParameter("ssn"));

		HttpSession ses = request.getSession();

		ses.setAttribute("obank", bankName);
		ses.setAttribute("oaccount", accountNo);
		ses.setAttribute("ossn", ssnNo);

		response.setContentType("text/html");
		response.sendRedirect("jsp/output.jsp");
	}

}
