package wds;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GuessNumber extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession(true);
		String str = req.getParameter("clientGuess");
		int guessNumber = -1;
		try {
			guessNumber = Integer.parseInt(str);
		} catch (Exception e) {
			resp.sendRedirect("InputNumber.jsp");
		}
		int saveNumber = ((Integer) session.getAttribute("savedNumber"))
				.intValue();
		if (guessNumber < saveNumber) {
			session.setAttribute("message", "猜小了！");
			resp.sendRedirect("InputNumber.jsp");
		}
		if (guessNumber > saveNumber) {
			session.setAttribute("message", "猜大了！");
			resp.sendRedirect("InputNumber.jsp");
		}
		if (guessNumber == saveNumber) {
			session.setAttribute("message", "恭喜你，猜对了！");
			resp.sendRedirect("InputNumber.jsp");
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
}
