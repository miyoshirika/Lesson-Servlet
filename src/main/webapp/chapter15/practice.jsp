<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<form action="practice" method="get">
    <input type="submit" name="sort" value="high">高い順
    <input type="submit" name="sort" value="low">低い順
</form>

<%@ page import="bean.PracticeBean,java.util.List" %>

<%
    List<PracticeBean> list =
        (List<PracticeBean>) request.getAttribute("products");
%>

<% for (PracticeBean p : list) { %>
    <%= p.getId() %> :
    <%= p.getName() %> :
    <%= p.getPrice() %> 円<br>
<% } %>

<%@include file="../footer.html" %>
