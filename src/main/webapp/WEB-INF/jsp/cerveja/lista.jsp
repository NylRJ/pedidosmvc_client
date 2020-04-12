<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lista de cerveja</title>
</head>
<body>
	<h4>Listagem de Games</h4>
	
	<h4><a href="/cerveja">Novo</a> | <a href="/produtos">Produtos</a> | <a href="/">Voltar</a></h4>
	
	<c:forEach var="item" items="${cervejas}">
		<h5>${item} <a href="/cerveja/${item.id}" >excluir</a> </h5>
	</c:forEach>
	
</body>
</html>