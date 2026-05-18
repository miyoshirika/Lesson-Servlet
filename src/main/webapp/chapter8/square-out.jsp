<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<%@page errorPage="square-error.jsp" %>

<%
request.setCharacterEncoding("UTF-8");
int number=Integer.parseInt(request.getParameter("number"));
%>

<p>入力した数値:<%=number %></p>
<p>結果:<%=number*number %></p>


<%@include file="../footer.html" %>