<!-- 
Author: Yashar Rahvar
errors JSP page 
This JSP is responsible to show the error page.
-->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<%@page isErrorPage="true"%>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Error!!!</title>
<LINK REL=STYLESHEET HREF="mainstyle.css" TYPE="text/css">
</head>
<body>
	<jsp:include page="/WEB-INF/jsps/header.jsp" flush="true" />
	<div id="mainDoc">

		<H3>Something went wrong. Please Try Again Later.</H3>

	</div>
	<jsp:include page="/WEB-INF/jsps/footer.jsp" flush="true" />

</body>
</html>
