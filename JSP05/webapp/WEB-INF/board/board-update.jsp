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
						<a id="menuDelete" class="nav-link" href="./delete?bno=${board.bno}">삭제</a>
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
					<textarea class="form-control" id="content" name="content" rows="5" >${board.content}</textarea> 
					<!--  cols=""는 생략가능 -->
				</div>
				<div class="form-group">
					<label for="userId">작성자 아이디</label>
					<input class="form-control"  id="userId" name="userId" type="text" 
					value="${board.userId}" readonly required/>
				</div>
				<input type="submit" value="수정 완료" class="form-control btn btn-outline-primary">
				 
								
			</form>
			
			
			
		</div>
		
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
		<script>
		$(document).ready(function () {
			// 아이디 속성이 menuDelete인 아이템을 클릭했을 때 실행할 이벤트 리스너를 등록.			
			$('#menuDelete').click(function () {
				// <a> 태그의 클릭 이벤트 기본 동작(요청 보내기)을 하지 못하도록 막음.
				event.preventDefault();
				
				// 사용자에게 정말 삭제할 것인지 확인
				var result = confirm('정말 삭제할까요?');
				// console.log(result) -> 확인 true, 취소 flase 리턴.
				
				if (result) { // 사용자가 확인(yes)을 클릭했을 때 
					// 페이지 이동 "/board/delete?bno=..." 이동
					location = $(this).attr('href');
					// $(this) -> ('#menuDelete') -> <a href>삭제</a>
					// attr(s): 속성 s의 값을 읽음.
				}
			});
		});
		</script>
	</body>
</html>