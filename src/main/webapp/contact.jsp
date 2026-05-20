<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>
<h1>内容を入力してください</h1>

<form action="contact" method="post">
	<p>
	名前<br>
	<input type="text" name="name">
	</p>
	
	<p>
	会社<br>
	<input type="text" name="office">
	</p>
	
	<p>
	メールアドレス<br>
	<input type="text" name="mail">
	</p>
	
	<p>
	お問い合わせ<br>
	<textarea name="info" cols="30"rows="5"></textarea>
	</p>
	
	<p>
	メルマガ種類<br>
	
	<input type="checkbox" name="merumaga">総合案内
	<input type="checkbox" name="merumaga">セミナー案内
	<input type="checkbox" name="merumaga">求人採用情報
	</p>
	
	<p>
	資料請求希望<br>
	<input type="radio" name="shiryo" value="yes" checked>yes
	<input type="radio" name="shiryo" value="no">no
	</p><br>
	
	<input type="submit" name="ok">
</form>

</body>
</html>