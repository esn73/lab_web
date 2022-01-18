<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page trimDirectiveWhitespaces="true" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		
			<meta name="viewport" content="width=device-width, initial-scale=1" />
		  <link rel="stylesheet" 
        	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" />
	</head>
	<body>
		<div class="container-fluid">
			<header class="jumbotron text-center">
				<h1>사용자 메인 페이지</h1>
			</header>
			
			<nav><!-- 사용자 기능 메뉴 -->
				<ul class="nav nav-tabs">
					<li class="nav-item">
						<a class="nav-link" href="../" >메인 페이지 돌아가기</a>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="insert" >회원 등록</a>
					</li>
				</ul>		
			</nav>
			
			<!-- 사용자 리스트 테이블 -->
			<table>
				<thead class="table table-hover">
					<tr>
						<th>아이디</th>
						<th>이메일</th>
						<th>포인트</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="u" items="${User}">
						<tr>
							<td>${u.userId}</td>
							<td>${u.email}</td>
							<td>${u.points}</td>
						</tr>
					</c:forEach>
				</tbody>          
		
			</table>
			
			<div> <!-- 검색 -->
			</div>
			
		</div>
		
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
	</body>
</html>