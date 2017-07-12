<!-- 
Author: Yashar Rahvar
logout JSP page 
This JSP is responsible to show the logout table.
-->
<TABLE id="table1" style="width: 100%">
	<TR>
		<TH align="left">Sign Off</TH>
	</TR>
	<TR id="employeeTables" >
		<TH id="employeeTables" align="left">
			<FORM METHOD="POST" ACTION="LogoutServlet">
				<input type="submit" name="userRequest" value="Logout" style="float: right">
			</FORM>
		</TH>
	</TR>
</TABLE>
