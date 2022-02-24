<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.taskapp.dao.Connection123"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Task List</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<style>
/* a {
  text-decoration: none;
} */
</style>



<body bgcolor="#00FFFF">

	<div class="container">


		<h1>TASK LISTS</h1>

		<input id='myInput' onkeyup='searchTable()' type='text'
			placeholder="Find Task">
			     <tr>
    	<td><label for="Findstatus">Status</label></td>
		<td>
			<select name="Findstatus" id="Findstatus"onchange='searchStatusTable()'>
					  		<option value="">Select Status</option>
			
		  		<option value="Pending">Pending</option>
		  		<option value="Completed">Completed</option>
		  				  		<option value="In-active">In-active</option>
		  		
			</select>
		</td>
     </tr>
			 
			
<!-- 			<input id='Findstatus'
			onkeyup='searchStatusTable()' type='text'
			placeholder="Find Task Status">

 -->
		<table id='myTable' class="table table-hover">
			<thead>
				<tr>
					<th scope="col">Task Name</th>
					<th scope="col">Priority</th>
					<th scope="col">Created By</th>
					<th scope="col">Status</th>
					<th scope="col">Created Date</th>
					<th scope="col">Action</th>
				</tr>

				<%
				Connection con = Connection123.getDBConnection();
				Statement statement = con.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from User_task");
				while (resultSet.next()) {
				%>

			</thead>
			<tbody>
				<tr>
					<td>
						<%
						out.print(resultSet.getString(1));
						%>
					</td>
					<td>
						<%
						out.print(resultSet.getString(2));
						%>
					</td>
					<td>
						<%
						out.print(resultSet.getString(3));
						%>
					</td>

					<td>
						<%
						out.print(resultSet.getString(4));
						%>
					</td>
					<td>
						<%
						out.print(resultSet.getString(6));
						%>
					</td>

					<td><a value="Edit" name="Action"
						href="edit.jsp?id=<%=resultSet.getInt(5)%> ">Edit</a></td>
					<td>
						<form action="IsActiveTaskServlet" method="post">
							<input type="hidden" id="id" name="id"
								value="<%=resultSet.getInt(5)%>">&nbsp;&nbsp; <input
								type="submit" value="Delete">
						</form>
					</td>

				</tr>
				<%
				}
				%>


			</tbody>
		</table>
	</div>

	<script>
		//JavaScript code
		function searchTable() {
			var input, filter, found, table, tr, td, i, j;
			input = document.getElementById("myInput");
			filter = input.value.toUpperCase();
			table = document.getElementById("myTable");
			tr = table.getElementsByTagName("tr");
			for (i = 0; i < tr.length; i++) {
				td = tr[i].getElementsByTagName("td");
				for (j = 0; j < td.length; j++) {
					if (td[j].innerHTML.toUpperCase().indexOf(filter) > -1) {
						found = true;
					}
				}
				if (found) {
					tr[i].style.display = "";
					found = false;
				} else {
					tr[i].style.display = "none";
				}
			}
		}

		function searchStatusTable() {
			var input, filter, found, table, tr, td, i, j;
			input = document.getElementById("Findstatus");
			filter = input.value.toUpperCase();
			table = document.getElementById("myTable");
			tr = table.getElementsByTagName("tr");
			for (i = 0; i < tr.length; i++) {
				td = tr[i].getElementsByTagName("td");
				for (j = 0; j < td.length; j++) {
					if (td[j].innerHTML.toUpperCase().indexOf(filter) > -1) {
						found = true;
					}
				}
				if (found) {
					tr[i].style.display = "";
					found = false;
				} else {
					tr[i].style.display = "none";
				}
			}
		}
	</script>
</body>
</html>  