<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- これはHTML形式のコメントです（ソースに表示されます） -->
<%--<title>ログイン</title> --%>
<title>ようこそ</title>
</head>
<body>
	LOGIN FORM
	<form method="post" action="LoginServlet">
		<div class="inputLow">
			<p>
				<input type="text" id="name" name="username" placeholder="username"/>
			</p>
		</div>
		<div>
			<p>
				<input type="password" id="password" name="password" placeholder="password"/>
		</div>
		<input type="submit" id="login" value="login"/>
	</form>


</body>
</html>