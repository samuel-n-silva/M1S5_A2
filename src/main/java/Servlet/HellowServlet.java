package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HellowServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8590216946644449933L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\"/>");
		out.println("<title>Meu primeiro Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Olá Mundo</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
