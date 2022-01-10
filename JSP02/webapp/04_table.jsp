<%@page import="edu.web.model.Board"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style>
			th,td,tr {
				border: 1px solid gray;
			}
		</style>
	</head>
	<body>
		<h1>JSP scriptlet과 expression을 사용한 테이블 작성 </h1>
		<%--
		Model 클래스 : Board
				* boardId : 글번호(int), 
				* title : 글 제목(String),
				* content: 글 본문(String), 
				* writer: 글 작성자 아이디(String), 
				* updateTime: 글 작성/ 수정 날짜 및 시간(Date)
				* viewCount: 조회수(int)
		
		Board를 저장하는 ArrayList를 선언, 생성.
		ArrayList에 더미 데이터를 저장.
		HTML table 작성
		 --%>
		 
		 
		 
		 
	<%
		
	%>
	<%
		
		ArrayList<Board> list = new ArrayList<>();	
		for (int i = 1; i <= 10; i++) {
			Board b = new Board(i, "제목"+i, "글 본문"+i, "admin", new Date(), i);
			list.add(b);	
		}
	%>
	
	<h2>Board 테이블</h2>
	<table>
		<thead>
			<tr>
			<th>BoardId</th>
			<th>Title</th>
			<th>Content</th>
			<th>Writer</th>
			<th>UpdateTime</th>
			<th>ViewCount</th>
			</tr>
		</thead>
		<tbody>
			<% for ( Board b : list) { %> <%--  --%>
				<tr>
					<td><%= b.getBoardId() %></td>
					<td><%= b.getTitle()%></td>
					<td><%= b.getContent()%></td>
					<td><%= b.getWriter()%></td>
					<td><%= b.getUpdateTime()%></td>
					<td><%= b.getViewCount()%></td>
				</tr>			
			<% }%>
		</tbody>
	
		</table>
		 
	</body>
</html>