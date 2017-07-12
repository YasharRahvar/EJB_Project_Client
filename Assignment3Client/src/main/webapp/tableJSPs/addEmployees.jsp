<!-- 
Author: Yashar Rahvar
AddEmployee JSP page 
This JSP is responsible to show the add employee table.
-->

<TABLE id="table1" style="width: 100%">
	<TR>
		<TH align="left">Add Employees</TH>
	</TR>
	<TR id="employeeTables">
		<TH align="left">
			<FORM METHOD="POST" ACTION="MainServlet">
				<label for="employeeID">ID: </label> <input type="text"
					name="employeeID"><BR> <label for="employeeFirstName">First
					Name:</label> <input type="text" name="employeeFirstName"><BR>
				<label for="employeeLastName">Last Name:</label> <input type="text"
					name="employeeLastName"><BR> <label for="employeeDOB">DOB:</label>
				<input type="text" name="employeeDOB" placeholder="YYYY/MM/DD"><BR>
				<input type="submit" name="addNewEmployee" value="Add"
					style="float: right">
			</FORM>
		</TH>
	</TR>
	<TR id="employeeTables">
		<Th align="left"><p style="color: red">${addResponseCode.error}</p></Th>
	</TR>
	<TR id="employeeTables">
		<Th align="left"><p style="color: green">${addResponseCode.code}
				${addResponseCode.desc}</p></Th>
	</TR>
</TABLE>
