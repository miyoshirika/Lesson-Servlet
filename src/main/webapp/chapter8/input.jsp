<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<form action="output.jsp" method="post">

<p>名前:<input type="text" name="username"></p>
<p>年齢:<input type="text" name="age"></p>
<input type="submit" name="送信">

</form>

<%@include file="../footer.html" %>