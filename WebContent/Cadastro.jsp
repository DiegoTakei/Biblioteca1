<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
		<h1> Cadastro<br></h1>
		<form action="CadastroUsuario.do" method="post">
			T�tulo:<input type="text" name="titulo">
			<br>
			<br>
			Autor:<input type="text" name="autor">
			<br>
			<br>
			Editora:<input type="text" name="editora">
			<br>
			<br>
			N� de P�ginas:<input type="text" name="paginas">
			<br>
			<br>
			Data de Publica��o:<input type="text" name="publicacao">
			<br>
			<br>
			Volume:<select>
				<option value="1">Livros</option>
	  			<option value="2">Peri�dicos</option>
	  			<option value="3">�udios</option>
	  			<option value="4">Fotografias</option>
	  		</select>
	  		<br>
	  		<br>
	  		Descri��o:<input type="textarea" name="descricao">
			<br>
			<br>
	  		<a href='Index.jsp' ><input type="submit" value="Cadastrar"></a>
		</form>
</body>
</html>