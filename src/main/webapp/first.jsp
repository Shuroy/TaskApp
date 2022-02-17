<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp page</title>
</head>
<body>
	<h1>First jsp page</h1>
	<%!int a = 10;
	int b = 20;
	String Name = "Spin Soft";

	public int Dosum() {
		return a + b;
	}

	public String Reverse() {
		StringBuffer br = new StringBuffer(Name);
		return br.reverse().toString();
	}%>
	<%
	out.println(a);
	out.println(b);
	out.println("<br>");
	out.println(Dosum());
	out.println("<br>");

	out.println(Reverse());
	%>
	<h1>
		Sum is
		<%=Dosum()%></h1>
	<%=Name%>

</body>
</html>