<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
switch (식) {
case 값:
	...
	break;
default:
	...
}

if(조건식) {

}else if(조건식) {
}else {

}

 --%>

<c:choose> <%-- switch --%>
	<c:when test="${param.color == 'r'}">  <%-- case --%>
		<c:set var="colorValue" value="red"></c:set>
	</c:when>
	<c:when test="${param.color == 'g'}">
		<c:set var="colorValue" value="green"></c:set>
	</c:when>
	<c:when test="${param.color == 'b'}">
		<c:set var="colorValue" value="blue"></c:set>
	</c:when>
	<c:otherwise>
		<c:set var="colorValue" value="black"></c:set> <%-- default --%>
	</c:otherwise>
</c:choose>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSTL</title>
		<style>
		span {
			color: ${colorValue};
		}
		</style>
	</head>
	<body>
		<h1>JSTL choose tag</h1>
		<h2>사용자 이름: <span>${param.userName}</span></h2>
	</body>
</html>