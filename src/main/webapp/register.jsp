 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task App</title>
</head>
<body>
<h1>Register Account</h1>
<form action="register" method="post" name="user_form">
	<table>
		<tr>
		
		<td>Name:</td>
		<td><input type="text" name="user_name" placeholder="Enter your name" required pattern="[a-zA-Z]{3,}" title="it only accept 3 or more chars"></td>
		
		</tr>
		<tr>
		
		<td>Email:</td>
		<td><input type="email" name="user_email" placeholder="Enter your email" required></td>
		
		</tr>
		<tr>
		
		<td>Password:</td>
		<td><input type="password" name="pass" placeholder="Enter your password" required></td>
		
		</tr>
		<tr>
		
		<td><input type="submit" value="Submit"></td>
		<td><input type="reset" value=Reset ></td>
		
		</tr>
		<h1>Add Task</h1>
		<a href="/TaskApp/addTask.jsp">Add</a>
		<a href="taskList.jsp">Show TaskList</a>
	</table>
</form>


<script>


</script>
</body>
</html>