<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<%@page isErrorPage="true" %>
<p>入力エラー:ユーザー名または年齢が正しくありません。</p>
<p><%=exception %></p>


<%@include file="../footer.html" %>