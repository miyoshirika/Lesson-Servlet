<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<%
String name=(String)session.getAttribute("name");
 %>
<h1>こんにちは、<%=name %>さん</h1>
<form action="input.jsp">
<input type="submit" value="戻る">
</form>

<%@include file="../footer.html" %>