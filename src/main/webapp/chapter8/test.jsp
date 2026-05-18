<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<!--<%-->
<!--	String name = request.getParameter("name");-->
<!--	out.print(name);-->
<!--%>-->

<!--<%-->
<!--	String numStr = request.getParameter("num");-->
<!--	int num = Integer.parseInt(numStr);-->
<!--	out.print(num*2);-->
<!--%>-->

<!--<%-->
<!--String message = request.getParameter("message");-->
<!--out.print(message);-->
<!--%>-->

<%
request.setCharacterEncoding("UTF-8");
String message = request.getParameter("message");
out.print(message);
%>

<%@include file="../footer.html" %>