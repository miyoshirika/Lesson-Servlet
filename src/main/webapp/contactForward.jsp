<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせ内容の確認</title>
</head>
<body>

<%
request.setCharacterEncoding("UTF-8");
String name=request.getParameter("name");
String office=request.getParameter("office");
String mail=request.getParameter("mail");
String info=request.getParameter("info");

%>

<h1>内容の確認</h1>
<p>
名前：<%=name %>
</p>
<p>
会社：<%=office %>
</p>
<p>
メールアドレス：<%=mail %>
</p>
<p>
お問い合わせ：<%=info %>
</p>

</body>
</html>