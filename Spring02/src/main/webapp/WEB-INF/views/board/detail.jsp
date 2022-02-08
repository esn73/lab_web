<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ex02</title>
        
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" 
        	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" />
    </head>
    <body>
        <div class="container-fluid">
            <header class="text-center">
                <h1>게시글 상세 보기 페이지</h1>
            </header>
            
            <nav> <!-- 네비게이션(페이지 이동 메뉴) -->
                <ul>
                    <li><a href="../">메인</a></li>
                    <li><a href="./main">게시판 메인</a></li>
                    <c:if test="${signInUserId == board.userid}">
                    <%--로그인 사용자 아이디와 글 작성자 아이디가 일치할 때만 수정 메뉴를 보여줌. --%>
                    <li><a href="./update?bno=${board.bno}">수정</a></li>
                    </c:if>
                </ul>
            </nav>
            
            <div>
                <form> <%--글 상세보기 --%>
                	<div>
                		<input type="hidden" id="bno" value="${board.bno}" />
                	</div>
                    <div>
                        <label for="title">글 제목</label>
                        <input type="text" id="title" name="title" value="${board.title}" required autofocus readonly />
                    </div>
                    <div>
                        <label for="content">글 내용</label>
                        <textarea rows="5" id="content" name="content" required readonly>${board.content}
                        </textarea>
                    </div>
                    <div>
                        <label for="userid">작성자 아이디</label>
                        <input type="text" id="userid" name="userid" value="${board.userid}" required readonly />
                    </div>
                    <div>
                        <label for="reg_date">최종 수정 시간</label>
                        <fmt:formatDate value="${board.reg_date}" pattern="yyyy/MM/dd HH:mm:ss" 
                            var="last_update_time"/>
                        <input type="text" id="reg_date" name="reg_date" value="${last_update_time}" readonly />
                    </div>
                </form>
            </div>
        
        	<hr />
        	<div> <%-- 댓글 작성 양식 --%>
        		<input type="text" id="rtext" name="rtext" placeholder="댓글 입력" />
        		<%-- 로그인한 사용자 아이디를 input의 값으로 설정 --%>
        		<input type="text" id="userid" name="userid" value="${signInUserId}" readonly />
        		<button id="btn_create_reply">댓글 작성 완료</button>
        	</div>
        	
        	<hr />
        	<div id="replies"> <%--댓글 목록 --%>
        	</div>
        </div>
        
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
		<script>
		$(document).ready(function () {
			// input[id="bno"] 요소의 value 속성값을 읽음
			var boardNo = $('#bno').val(); 
			
			// 게시글 번호(boardNo)에 달려 있는 모든 댓글 목록을 읽어오는 Ajax함수 정의(선언)
			function getAllReplies() {
				// $.getJSON(요청 URL,  콜백 함수): URL로 Ajax GET 요청을 보내고 JSON 문자열을 응답으로 전달받아서 처리.
				// JSON 문자열을 응답으로 전달받아서 처리하는 함수.
				$.getJSON('/ex02/replies/all/' + boardNo, function (data) {
					console.log(data);
				});
			} //end getAllReplies()
			
			getAllReplies(); //함수 호출
				
		});
		</script>
    </body>
</html>