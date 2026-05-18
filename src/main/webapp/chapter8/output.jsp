<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<%@page errorPage="error.jsp" %>

<%
String username = request.getParameter("username");
String ageStr = request.getParameter("age");

if(username == null || username.isEmpty() || ageStr == null || ageStr.isEmpty()){
	;
}
int age = Integer.parseInt(ageStr);

%>

<p>ユーザー名:<%=username %></p>
<p>年齢:<%=age %></p>


<%@include file="../footer.html" %>