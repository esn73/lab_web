<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page trimDirectiveWhitespaces="true" %>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>JSTL</h1>
		<h2>JSP(Java Server Page) Standard Tag Library</h2>
		<c:set var="userName" value="관리자"></c:set>
		<h3>
			<c:out value="${ userName }"></c:out>
		</h3>
		
	</body>
</html>