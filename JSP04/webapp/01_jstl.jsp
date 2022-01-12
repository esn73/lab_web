<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%-- taglib 지시자 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%--
JSTL 사용 방법:
1. tomcat.apach.org 사이트  Taglibs 다운로드 페이지
https://tomcat.apache.org/download-taglibs.cgi에서
 	(1) taglibs-standard-impl-1.2.5.jar
 	(2) taglibs-standard-spec-1.2.3.jar
 	파일을 다운로드하고 project/webapp/WEB-INF/lib 폴더에 복사.
2. tagLib 지시자(directive) 작성

 --%>


<!DOCTYPE html>
<html>
		<head>
		<meta charset="UTF-8">
		<title>JSTL</title>
	</head>
	<body>
	
		<h1>JSTL</h1>
		<h2>JSP(Java Server Page) Standard Tag Library</h2>
		
		<c:set var="userName" value="관리자" ></c:set>
		<%-- 
		<c:set var="변수 이름" value="변수 값" scope="변수를 저장할 영역"></c:set>
		변수 저장 영역: page(기본값)< request < session < application
		위 코드는 <% pageContext.setAttribute("userName", "관리자"); %>와 동일
		<% request.setAttribute("속성 이름","속성 값");%>
		--%>
		
		<h3>
			<c:out value="${ userName }"></c:out> <%-- el 과 jstl을 사용해서 아래랑 같은 코드를 쉽게 사용할 수 있음 --%>
			<%--위 코드는  
			<% out.print(pageContext.getAttribute("userName")); %>
			와 동일
			--%>
		</h3>
	</body>
</html>
