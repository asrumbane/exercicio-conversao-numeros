<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
			<title> Números Convertidos </title>
		</head>
	<body> <br>
	<h2> Conversão de números árabes em romanos </h2>
	<hr color="blue">
		<form action="adicionar" method="post">
			<table>
				<tr>
					<td><h3> Número em árabe inserido: </h3></td> 
					<td><input type="text" name="arabe1" value="${valorIntroduzido}"/> </td>	
											
					<td><h3> Número em romano: </h3></td> 
					<td> <input type="text" name="romano" value="${resulato}"/></td>
				</tr>
			</table>
		</form>
		<hr color="blue">
		<form action="formulario.jsp">
			<input type="submit" value="Voltar"/>	
			</form>
	</body>
</html>