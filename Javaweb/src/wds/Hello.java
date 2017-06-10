package wds;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		if ("admin".equals(name) && "admin".equals(password)) {
			req.setAttribute("names", name);
			req.getRequestDispatcher("Main.jsp").forward(req, resp);
			return;
		}
		resp.sendRedirect("Login.jsp");
		return;
	}
}
