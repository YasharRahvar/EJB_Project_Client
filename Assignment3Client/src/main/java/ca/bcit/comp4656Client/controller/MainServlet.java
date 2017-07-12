/**
 * @author Yashar Rahvar
 * Date: 10/Jan/2017
 * Project: EJB Project 
 * Class: MainServlet
 * This servlet is responsible for control all user request and dispatch them to appropriate destinations. 
 */
package ca.bcit.comp4656Client.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import ca.bcit.comp4656.jpa.entity.ClientResponse;
import ca.bcit.comp4656.jpa.entity.ResponseCode;
import ca.bcit.comp4656.service.EmployeeServicesInterface;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(MainServlet.class);

	/**
	 * EmployeeService instance using global JNDI name.
	 */
	@EJB(mappedName = "java:global/A00871798/EmployeeServices!ca.bcit.comp4656.Assignment3Remote")
	EmployeeServicesInterface employeeServices;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (null != request.getParameter("findByID")) {
			log.debug("User attempts to find an employee");
			ClientResponse clientResponse = employeeServices.find(request.getParameter("employeeID"));
			request.setAttribute("employeeObj", clientResponse.getEmployee());
			request.setAttribute("findResponseCode", clientResponse.getResponseCode());
		}
		if (null != request.getParameter("deleteByID")) {
			log.debug("User attempts to delete an employee");
			ResponseCode responseCode = employeeServices.delete(request.getParameter("employeeID"));
			System.out.println(request.getParameter("employeeID"));
			request.setAttribute("deleteResponseCode", responseCode);
		}
		if (null != request.getParameter("addNewEmployee")) {
			log.debug("User attempts to add an employee");
			ResponseCode responseCode = employeeServices.add(request.getParameter("employeeID"),
					request.getParameter("employeeFirstName"), request.getParameter("employeeLastName"),
					request.getParameter("employeeDOB"));
			request.setAttribute("addResponseCode", responseCode);
		}
		log.debug("Getting all employees into a list and set it as an attribute.");
		request.getServletContext().setAttribute("employees", employeeServices.getEmployee());
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
