<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biblioteca</title>
	</head>
	<body>
		<form action="Login.do" method="post">
			<h2>Nome:</h2><input type="text" name="name">
			<br>
			<br>
			<h2>Senha:</h2><input type="password" name="senha">
			<br>
			<br>
	  		<input type="submit" name="ok" value="Logar" > <br>
		</form>
		<br> <br>
		<form action="Consulta.jsp">
			<h2>Usuário</h2>
			<input type="submit" value="Consultar volumes cadastrados">
			
		</form>
	</body>
</html>