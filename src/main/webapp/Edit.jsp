<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Task</title>
</head>
<body bgcolor="#00FFFF">
  <form action="EditTaskServlet" method="post">
  Hello <b><%= request.getParameter("id") %></b>
  
    <h1 align="center">Edit Task</h1>
    <h1>
      <a href=TaskList.jsp>Task List</a>
    </h1>
    <table border="1" align="center" cellpadding="5"
      style="font-size: 200%; font-family: inherit; font-style: normal; background-color: window;">
     
     
      <tr>
        <td>Task Name</td>
        <td><input type="text" name="task_name"><input type="hidden" value="<%= request.getParameter("id") %>" name="id"></td>
      </tr>
     
     <tr>
    	<td><label for="cars">Status</label></td>
		<td>
			<select name="status" id="status">
		  		<option value="Pending">Pending</option>
		  		<option value="Completed">Completed</option>
			</select>
		</td>
     </tr>
     
     
     
      <tr>
        <td></td>
        <td align="center"><input type="submit" name="Action"
          value="Edit"></td>
      </tr>
    </table>

  </form>
</body>
</html>



<%-- 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  name ="task" action="TaskServlet"  method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td>
						<input type="text" name="task_name" id="task_name" placeholder="Enter your Task name" required title="it only accept 3 or more chars">
					</td>
					<td>
						<label for="cars">Status</label>
						<select name="cars" id="cars">
						  <option value="Pending">Pending</option>
						  <option value="Completed">Completed</option>
						
						</select>
					<td/>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"></td>
					<td><input type="reset" ></td>
				</tr>
			</table>
		</form>
</body>
</html> --%>