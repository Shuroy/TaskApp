
 	
<!DOCTYPE html>
<html>
<head>	
<meta charset="ISO-8859-1">
<title>Task App</title>

</head>
<body>
<h1>Add Task</h1>
<a href="/TaskApp/Addtask.jsp">Add</a>
<form action="lisklist"  method="get">
	<table border="1" cellpadding="5">
		<tr>
			<th>S.No</th>
			<th>Task Name</th>
			<th>Priority</th>
			<th>Created By</th>
			<th>Status</th>
			<th>Created Date</th>
			<th>Action</th>
		</tr>
		    
			<tr>
			<c:forEach items="tasklist12" var="u">
				<th>1</th>
				<th></th>
				<th>Low</th>
				<th>Shubhan</th>
				<th>Pending</th>
				<th>02/02/22</th>
				<th><a href="#" >Edit</a> &nbsp; &nbsp; <a href="#" >Delete</a> </th>
				
			</tr> </c:forEach>
		
	</table>
</form>
</body>
</html>