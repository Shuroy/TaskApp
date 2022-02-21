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
<title>Insert title here</title>
</head>
<style>
<!--
a {
  text-decoration: none;
}
-->
</style>
<body bgcolor="#00FFFF">
  <form action="">
    <h1 align="center">Task Management</h1>
    <h2 align="center">
      <a href="AddTask.jsp">Add New Task</a><br>
    </h2>
    <h1 align="center">List of Tasks</h1>
    <table border="1" align="center" cellpadding="5" style="font-size: 150%; background-color: window;">
      <tr>
			<th id="2">Task Name</th>
			<th id="3">Priority</th>
			<th id="4">Created By</th>
			<th id="5">Status</th>
			<th id="6">Created Date</th>
			<th id="7">Action</th>
      </tr>
      <%
        Connection con = Connection123.getDBConnection();
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from user_task");
        while (resultSet.next()) {
      %>

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
            out.print(resultSet.getString(5));
          %>
        </td>
        
        <form action="MyServlet" method="post">
          <td><a value="Edit" name="Action"
            href="Edit.jsp?id=<%=resultSet.getInt(6)%> ">Edit</a> 
            <input
            type="hidden" id="id" name="id" value="<%= resultSet.getInt(6) %>">&nbsp;&nbsp;&nbsp;
            <a href="delete.jsp">Delete</a>&nbsp;&nbsp;&nbsp;</td>
      </tr>
      </form>
      
      <%
}
%>


    </table>
  </form>
</body>
</html>S