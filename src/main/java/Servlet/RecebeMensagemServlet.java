package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RecebeMensagemServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2047273310645975045L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String frase = request.getParameter("frase");
		String autor = request.getParameter("autor");
		String nome = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\"/>");
		out.println("<title>Frases</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>"+nome+"</h1>");
		out.println("<p>Frase: "+frase+" Autor: "+autor+"</p>");
		out.println("</body>");
		out.println("</html>");
	}
	

}
