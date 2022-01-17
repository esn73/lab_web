<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page trimDirectiveWhitespaces="true" %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>MVC</title>
		
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		  <link rel="stylesheet" 
        	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" />
	</head>
	<body>
		<div class="container-fluid">
			<header class="jumbotron text-center">
				<h1>글 수정 페이지</h1>
			</header>
			
			<nav> <!-- navigation menu -->
				<ul class="nav nav-tabs">
					<li class="nav-item">
						<a class="nav-link" href="../">메인</a>					
					</li>
					<li class="nav-item"><a class="nav-link" href="./main">게시판 메인</a></li>
					<li class="nav-item">
						<!-- 수정하기	 -->
					<a class="nav-link" href="./detail?bno=${board.bno}">이전 페이지</a></li>
					<li class="nav-item">
						<a class="nav-link">삭제</a> <!-- TODO -->
					</li>
				</ul>
			</nav>
			
			<form action="update" method="post">
				<div class="form-group">
					<label for="bno">글 번호</label>
					<input class="form-control" id="bno" name="bno"
						type="number" value="${board.bno}" readonly/> <!-- readonly 편집을 막는 속성 -->
				</div>
				<div class="form-group">
					<label for="title">제목</label>
					<input class="form-control"  id="title" name="title"
						type="text" value="${board.title}" required />
				</div>
				<div class="form-group">
					<label for="content">내용</label>
					<textarea class="form-control" id="content" rows="5" >${board.content}</textarea> 
					<!--  cols=""는 생략가능 -->
				</div>
				<div class="form-group">
					<label for="userId">작성자 아이디</label>
					<input class="form-control"  id="userId" name="userId" type="text" 
					value="${board.userId}" readonly required/>
				</div>
				<input type="submit" value="수정 완료" class="form-controll btn-outline-primary">
								
			</form>
			
			
			
		</div>
		
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
	</body>
</html>