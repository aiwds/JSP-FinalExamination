package wds;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RussianAlphabet extends HttpServlet {
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
		out.print("<br>Сд������ĸ: ");
		out.print("<p>");
		for (char c = '��'; c <= '��'; c++)
			out.print(" " + c);
		out.println("<p>");
		out.print("��д������ĸ: ");
		out.print("<p>");
		for (char c = '��'; c <= '��'; c++)
			out.print(" " + c);
		out.println("</body></html>");
	}
}
