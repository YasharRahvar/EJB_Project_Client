<!-- 
Author: Yashar Rahvar
index JSP page 
This JSP is responsible to show the main page which includes all tables.
-->
<%@ page errorPage="/WEB-INF/jsps/errors.jsp "%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<head>
<title>EJB Project</title>
<LINK REL=STYLESHEET HREF="mainstyle.css" TYPE="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<jsp:include page="/WEB-INF/jsps/header.jsp" flush="true" />

	<!-- main document body -->
	<div id="mainDoc">
		<H2>${applicationScope.serverDownMessage}</H2>

		<div id="left">
			<div class="boxed">
				<p align="center">
					<strong>Employee List</strong>
				</p>
			</div>
			<jsp:include flush="true" page="/tableJSPs/newDataTable.jsp" />


			<%--For displaying Page numbers. 
	The when condition does not display a link for the current page--%>


			<%@ include file="../tableJSPs/logout.jsp"%>

			<!-- if (request.isUserInRole
 -->
		</div>
		<div id="right">
			<c:if test="${pageContext.request.isUserInRole('admin')}">
				<jsp:include flush="true" page="/tableJSPs/addEmployees.jsp" />
				<jsp:include flush="true" page="/tableJSPs/deleteEmployees.jsp" />
			</c:if>
			<jsp:include flush="true" page="/tableJSPs/findEmployees.jsp" />

		</div>

	</div>
</body>
</html>