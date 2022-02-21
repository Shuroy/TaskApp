<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TaskApp</title>
</head>
	<body>
		<h1>Add Task</h1>
		<form  name ="priority" action="TaskServlet"  method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td>
						<input type="text" name="priority" id="task_name" placeholder="Enter your Task name" required title="it only accept 3 or more chars">
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"></td>
					<td><input type="reset" ></td>
				</tr>
			</table>
		</form>
	</body>
</html>