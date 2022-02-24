<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Task</title>
</head>
<body bgcolor="#00FFFF">
  <form action="EditTaskServlet" method="post">
  
    <h1 align="center">Edit Task</h1>
    <h1>
      <a href=taskList.jsp>Task List</a>
    </h1>
    <table border="1" align="center" cellpadding="5"
      style="font-size: 200%; font-family: inherit; font-style: normal; background-color: window;">
     
     
      <tr>
        <td>Task Name</td>
        <td><input type="text" name="task_name"><input type="hidden" value="<%=request.getParameter("id") %>" name="id"></td>
      </tr>
     
     <tr>
    	<td><label for="status">Status</label></td>
		<td>
			<select name="status" id="status">
		  		<option value="Pending">Pending</option>
		  		<option value="Completed">Completed</option>
			</select>
		</td>
     </tr>
     
     <tr>
    	<td><label for="priority">Priority</label></td>
		<td>
			<select name="priority" id="priority">
		  		<option value="Low">Low</option>
		  		<option value="High">High</option>
			</select>
		</td>
     </tr>
     
      <tr>
        <td>Created By</td>
        <td><input type="text" name="created_by"></td>
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