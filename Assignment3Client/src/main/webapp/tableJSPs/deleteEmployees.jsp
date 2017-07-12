<!-- 
Author: Yashar Rahvar
deleteEmployees JSP page 
This JSP is responsible to show the delete employee table.
-->
<TABLE id="table1" style="width: 100%; float=right">
	<TR>
		<TH align="left">Remove An Employee</TH>
	</TR>
	<TR id="employeeTables" >
		<TH align="left">
			<FORM METHOD="POST" ACTION="MainServlet">
				<label for="ID">ID:	   </label> 
				<input type="text" name="employeeID"><BR>
				<input type="submit" name="deleteByID" value="Delete" style="float: right">
			</FORM>
		</TH>
	</TR>
	<TR id="employeeTables">
		<Th align="left"><p style="color:red">${deleteResponseCode.error}</p></Th>
	</TR>
	<TR id="employeeTables">
		<TH align="left"><p style="color:green">${deleteResponseCode.code} ${deleteResponseCode.desc}</p></TH>
	</TR>
</TABLE>
