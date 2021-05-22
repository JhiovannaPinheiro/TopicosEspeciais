<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html>
	<head>
		
		<meta charset="ISO-8859-1">
		<meta charset="UTF-8">
		<title>Book</title>
	
	</head>
	
	<body>

	<% 
	
		if (request.getParameter("titulo") == null || request.getParameter("ano") == null || request.getParameter("autor") == null) {
			out.println("<h2> Por favor, para procurar o livro digite o título, ano de publicação e o autor da obra na URL!</h2>");
			
		} 
		
		else {
			out.println("<h2>Título: " + request.getParameter("titulo") + "<br>" + "Ano: " + 
			request.getParameter("ano") + "<br>" + "Autor: " + request.getParameter("autor") + "</h2>");
		
		}
	
	%>
	
	</body>
	</html>
