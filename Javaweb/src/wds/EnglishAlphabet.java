package wds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EnglishAlphabet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<style>");
		out.print("body{font-size:20px;}");
		out.print("</style>");
		out.println("<body>");
		out.println("<br>Ð¡Ð´Ó¢ÎÄ×ÖÄ¸: ");
		out.print("<p>");
		for (char c = 'a'; c <= 'z'; c++)
			out.print(" " + c);
		out.println("<p>");
		out.println("´óÐ´Ó¢ÎÄ×ÖÄ¸: ");
		out.print("<p>");
		for (char c = 'A'; c <= 'Z'; c++)
			out.print(" " + c);
		out.println("</body></html>");
	}
}
