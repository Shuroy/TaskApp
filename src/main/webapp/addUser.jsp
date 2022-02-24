<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TaskApp</title>
</head>
	<body>
		<h1>User Name</h1>
		<form name ="User" action="UserServlet"  method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td>
						<input type="text" name="user_name" id="user_name" placeholder="Enter your user name" required title="it only accept 3 or more chars">
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