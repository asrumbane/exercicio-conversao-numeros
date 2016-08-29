<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<br>
	<h2>Conversão de números árabes em romanos </h2>
	<hr color="blue">
		<form action="adicionar" method="get">
		<table>
			<tr>
				<td><h3>Insira o número em árabe:</h3></td> <td><input type="text" name="arabe"/> </td>	
									
			<td><h3>Número em romano:</h3></td> <td> <input type="text" name="romano" ${resulato}/></td>
				</tr>
			</table>
		</form>
		<hr color="blue">
		
		<h1>O número em romano é: ${resulato} </h1>
</body>
</html>