<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cachaca</title>
</head>
<body>

	<form action="/cachaca" method="post">
		Descrição: <input type="text" name="descricao">
		Tipo: <input type="text" name="tipo">
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>