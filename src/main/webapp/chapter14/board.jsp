<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<h2>掲示板</h2>

<form action="board" method="post">
	<p>
		名前:
		<input type="text" name="name" required>
	</p>
	
	<p>
		本文:
		<textarea name="content" required></textarea>
	</p>
	
	<input type="submit" value="投稿">
</form>

<%=name%>

<%@include file="../footer.html" %>