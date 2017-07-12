/**
 * @author Yashar Rahvar
 * Date: 10/Jan/2017
 * Project: EJB Project 
 * Class: LogoutServlet
 * This servlet is responsible for logging out the user. 
 */
package ca.bcit.comp4656Client.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(LogoutServlet.class);

	/**
	 * Invalidates the session and dispatch to logout.jsp
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().invalidate();
		log.debug(request.getSession().getId() + "Logs out");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsps/header.jsp");
		dispatcher.include(request, response);
		dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/jsps/goodbye.jsp");
		dispatcher.include(request, response);
		dispatcher = request.getRequestDispatcher("/WEB-INF/jsps/footer.jsp");
		dispatcher.include(request, response);
	}

	/**
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}