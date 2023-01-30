package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InformaMensagemServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7761262910208242851L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Informe Mensagem...</title>");
		out.println("<meta charset=\"UTF-8\"/>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action=\"receberMensagem\">");
		out.println("<p>Titulo</p>");
		out.println("<p><input type=\"text\" name=\"nome\" required></p>");
		out.println("<p>Digite Sua Frase</p>");
		out.println("<p><input type=\"text\" name=\"frase\" required></p>");
		out.println("<p>Autor</p>");
		out.println("<p><input type=\"text\" name=\"autor\" required></p>");
		out.println("<p><button type=\"submit\">Enviar</button></p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
	

}
