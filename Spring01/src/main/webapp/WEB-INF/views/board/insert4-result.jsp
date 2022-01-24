<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ex01</title>
		
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		  <link rel="stylesheet" 
        	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" />
	</head>
	<body>
		<h1>새글 작성 4 결과 페이지</h1>
		<p>글 번호: ${board.bno}</p>
		<p>글 제목: ${board.title}</p>
		<p>작성자 아이디: ${board.userid}</p>
		
	    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
	</body>
</html>