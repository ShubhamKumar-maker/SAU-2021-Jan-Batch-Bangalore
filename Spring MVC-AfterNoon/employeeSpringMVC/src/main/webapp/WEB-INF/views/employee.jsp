<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false" %>

<html>
<body>
<h2>Hello World!</h2>
<p>
Employee data 
<hr><br>

<c:forEach var="employee" items="${employeeList}">
			${employee.id} |
			${employee.firstName}|
			${employee.lastName}|
			${employee.email}|
			<a href="/employeeSpringMVC/update?userid=${employee.id}">update</a>
			<hr><br>

</c:forEach>

</p>

</body>
</html>