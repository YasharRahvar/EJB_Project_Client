<!-- 
Author: Yashar Rahvar
findEmployees JSP page 
This JSP is responsible to show the find employee table.
-->
<TABLE id="table1" style="width: 100%">
	<TR>
		<TH align="left">Find An Employee By ID</TH>
	</TR>
	<TR id="employeeTables" >
		<TH id="employeeTables" align="left">
			<FORM METHOD="POST" ACTION="MainServlet">
				<label for="ID">ID:	   </label> 
				<input type="text" name="employeeID" ><BR>
				<input type="submit" name="findByID" value="Search" style="float: right">
			</FORM>
		</TH>
	</TR>
	
	<TR id="employeeTables">
		<Th align="left"><p style="color:red">${findResponseCode.error}</p></Th>
	</TR>
	<TR id="employeeTables">
		<Th align="left"><p style="color:green">${employeeObj.firstName} ${employeeObj.lastName}</p>
		<p style="color:green">${findResponseCode.code} ${findResponseCode.desc}</p></Th>
	</TR>
</TABLE>
