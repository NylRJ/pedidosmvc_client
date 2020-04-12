<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>comanda</title>
</head>
<body>

	<form action="/comanda" method="post">
		Comanda: <input type="text" name="descricao">
		Cliente: <input type="text" name="cliente.descricao">
		
		<c:forEach var="p" items="${produtos}">
			<h5>
			<input type="checkbox" value="${p}" name="produtos"> ${p.descricao}
			</h5>
		</c:forEach>
		
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>