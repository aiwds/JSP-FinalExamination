package wds;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IPAddress extends HttpServlet {
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
		out.print("body{font-size:25px;}");
		out.print("</style>");
		out.println("<body>");
		InetAddress ip;
		ip = Inet6Address.getLocalHost();
		String localname = ip.getHostName();
		String localip = ip.getHostAddress();
		out.println("<br>本机名: " + localname + "<p>");
		out.println("IP地址: " + localip);
		out.println("</body></html>");
	}
}
