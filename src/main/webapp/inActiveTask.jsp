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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<style>
/* a {
  text-decoration: none;
} */
</style>



<body bgcolor="#00FFFF">


<div class="container">


<h1>In-active Task</h1>
<input id='myInput1' onkeyup='searchTable1()' type='text'>
      
	<table id='myTable1' class="table table-hover">
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
	        Connection con1 = Connection123.getDBConnection();
	        Statement statement1 = con1.createStatement();
	        ResultSet resultSet1 = statement1.executeQuery("select * from User_task where IsActive = 1");
	        while (resultSet1.next()) {
	      %>
	      
	  </thead>
	  <tbody>
	    <tr>
	        <td><%out.print(resultSet1.getString(1));%></td>
	        <td><%out.print(resultSet1.getString(2));%></td>
	        <td><%out.print(resultSet1.getString(3));%></td>
	        
	        <td style="color:red">In-active</td>
	         <td><%out.print(resultSet1.getString(6));%></td>
	         
	          <td>
	          	<a value="Edit" name="Action" href="edit.jsp?id=<%=resultSet1.getInt(5)%> ">Edit</a> 
	          </td>
	           <td>
	          	 <form action="DeleteTaskServlet" method="post">
		             	<input type="hidden" id="id" name="id" value="<%= resultSet1.getInt(5) %>">&nbsp;&nbsp;
		            	<input type="submit" value="Delete">
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

function searchTable1() {
    var input, filter, found, table, tr, td, i, j;
    input = document.getElementById("myInput1");
    filter = input.value.toUpperCase();
    table = document.getElementById("myTable1");
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