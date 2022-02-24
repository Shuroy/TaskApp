<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Task</title>
</head>
<body bgcolor="#00FFFF">
  <form action="DeleteTaskServlet" method="post">
 
    <h1 align="center">Delete Task</h1>
    <h1>
      <a href=TaskList.jsp>Task List</a>
    </h1>
    <table border="1" align="center" cellpadding="5"
      style="font-size: 200%; font-family: inherit; font-style: normal; background-color: window;">
     
     
      <tr>
        <td>Task Name</td>
        <td><input type="text" name="task_name"><input type="hidden" value="<%=request.getParameter("id") %>" name="id"></td>
      </tr>
     
     <tr>
    	<td><label for="cars">Status</label></td>
		<td>
			<select name="task_name" id="status">
		  		<option value="Pending">Pendin g</option>
		  		<option value="Completed">Completed</option>
			</select>
		</td>
     </tr>
     
     
     
      <tr>
        <td></td>
        <td align="center"><input type="submit" name="Action"
          value="Delete"></td>
      </tr>
    </table>

  </form>
</body>
</html>