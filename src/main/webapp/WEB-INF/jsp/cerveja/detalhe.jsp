<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ceveja</title>
</head>
<body>

	<form action="/cerveja" method="post">
		Descri��o: <input type="text" name="descricao">
		N�vel: <input type="text" name="nivel">
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>