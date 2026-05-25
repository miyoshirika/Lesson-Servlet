<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<form action="name-input-servlet" method="post">
<%
String name=(String)session.getAttribute("name");
%>

<p>
名前：<input type="text" name="name" value=<%=name !=null?name :"" %>>
</p>
<input type="submit" name="送信">

</form>

<%@include file="../footer.html" %>