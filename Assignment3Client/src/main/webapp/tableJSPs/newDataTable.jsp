<!-- 
Author: Yashar Rahvar
dataTable JSP page 
This JSP is responsible to show the all employees in a table using displayTag API.
-->

<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<style type="text/css">
table {
	width: 100%;
}
</style>
<display:table name="applicationScope.employees" id="m"
	decorator="ca.bcit.comp4656Client.decorators.DateDecorator" sort="list"
	defaultorder="descending" pagesize="5">
	<display:setProperty name="paging.banner.placement" value="bottom" />
	<display:column property="id" title="ID" />
	<display:column property="firstName" sortable="true" title="First Name" />
	<display:column property="lastName" title="Last Name" />
	<display:column property="dob" title="DOB" sortable="true" />
</display:table>
