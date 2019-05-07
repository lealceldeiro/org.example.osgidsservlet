package org.example.osgidsservlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class, property = { "alias:String=/hello" }, immediate = true)
public class LogsHTTPServlet extends HttpServlet {

	private static final long serialVersionUID = 2302372200114479484L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			resp.setContentType("text/plain");
			resp.getWriter().println("It works!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		resp.setStatus(200);
	}
}
