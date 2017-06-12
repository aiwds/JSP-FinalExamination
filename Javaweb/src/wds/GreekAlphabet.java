package wds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreekAlphabet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<style>");
		out.print("body{font-size:20px;}");
		out.print("</style>");
		out.println("<body>");
		out.print("<br>Ð¡Ð´Ï£À°×ÖÄ¸: ");
		out.print("<p>");
		for (char c = '¦Á'; c <= '¦Ø'; c++)
			out.print(" " + c);
		out.println("<p>");
		out.print("´óÐ´Ï£À°×ÖÄ¸: ");
		out.print("<p>");
		for (char c = '¦¡'; c <= '¦¸'; c++)
			out.print(" " + c);
		out.println("</body></html>");
	}
}
