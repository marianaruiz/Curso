<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Convertir Grados Centigradosa Fahrenheit</title>
</head>
	<body>
	        <h2>Convertir Grados Centigradosa Fahrenheit</h2>
	        <form method="POST" action="/ejercicio7.1/conversor/c2f.html">
		        <table border="0">
			        <tr><td><label for="unidadOrigen">Centigrados</label></td>
			        <td><input type="number" name="unidadOrigen" value="${requestScope.unidadOrigen}" step="0.01" /></td></tr>
			        <tr><td><label for="unidadDestino"> Fahrenheit</label></td>
			        <td><input type="number" name="unidadDestino" value="${requestScope.unidadDestino}" /></td></tr>
			        <tr><td colspan="2" align="center"><input type="Submit" value="Convertir" /></td></tr>
		        </table>
	        </form>
	        <a href=/ejercicio7.1/index.html>Regresar</a>
	</body>
</html>