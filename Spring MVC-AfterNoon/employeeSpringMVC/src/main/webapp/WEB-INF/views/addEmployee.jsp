<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<body>
<div>
<form:form action="saveEmployee" modelAttribute="employee" method="GET">
<form:hidden path="id" placeholder="enter employee id" name="id"/>
<form:input path="firstName" placeholder="enter employee name" name="firstname"/>
<form:input path="lastName" placeholder="enter employee last name" name="lastname"/>
<form:input path="email" placeholder="enter employee email" name="email"/>
<input type="submit" value="add employee"/>
</form:form>
</div>

</body>
</html>