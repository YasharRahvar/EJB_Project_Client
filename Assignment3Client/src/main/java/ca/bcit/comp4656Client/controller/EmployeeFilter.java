/**
 * @author Yashar Rahvar
 * Date: 10/Jan/2017
 * Project: EJB Project 
 * Class: EmployeeFilter
 * This filter is responsible for getting all employees from the server. 
 */
package ca.bcit.comp4656Client.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.log4j.Logger;

import ca.bcit.comp4656.service.EmployeeServicesInterface;

@WebFilter(filterName = "employeeFilter", urlPatterns = "/*")
public class EmployeeFilter implements Filter {
	/**
	 * EmployeeService instance using global JNDI name.
	 */
	@EJB(mappedName = "java:global/A00871798/EmployeeServices!ca.bcit.comp4656.Assignment3Remote")
	EmployeeServicesInterface employeeServices;

	/**
	 * @param request
	 * @param response
	 * @param chain
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		chain.doFilter(request, response);
	}

	/**
	 * Getting employees from the server and sets it as an attribute.
	 * 
	 * @param filterConfig
	 */
	public void init(FilterConfig filterConfig) throws ServletException {

		filterConfig.getServletContext().setAttribute("employees", employeeServices.getEmployee());
	}

	/**
	 * 
	 */
	public void destroy() {

	}

}
