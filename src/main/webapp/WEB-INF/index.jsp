<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cats</title>
</head>
<body>
	<h1>This is a website about cats!</h1>
	<ul>
	<c:forEach items="${cats}" var="cat">
		<c:if test="${cat.charAt(0)== 'G'}" >
			<li style="color:green;">${cat}</li>
		</c:if>
		<c:if test="${cat.charAt(0)!= 'G'}" >
			<li>${cat}</li>
		</c:if>
		
		
	</c:forEach>
	</ul>

</body>
</html>