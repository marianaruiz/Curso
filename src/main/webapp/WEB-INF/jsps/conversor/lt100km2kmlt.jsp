<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.math.BigDecimal" %>
<%@ page import="conversor.negocio.ConversorUnidadesUtils" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consumo de Combustible</title>
</head>
<body>
	<h2>Consumo de Combustible</h2>
	<form method="POST" action="/ejercicio7.1/conversor/lt100km2kmlt.html">
		<table border="0">
            <tr>
    		  <td><label for="unidadOrigen">Litros / 100 Kil&oacute;metros</label></td>
		      <td><input type="number" name="unidadOrigen" value="${requestScope.unidadOrigen}" step="0.01" /></td>
		    </tr>
            <tr>
                <td><label for="unidadDestino">Kil&oacute;metros / Litro</label></td>
		        <td><input type="number" name="unidadDestino" value="${requestScope.unidadDestino}" /></td>
		    </tr>
		    <tr>
		      <td colspan="2" align="center"><input type="Submit" value="Convertir" /></td>
		    </tr>
		</table>
	</form>
	
	<a href="/ejercicio7.1/index.html">Regresar</a>    
</body>
</html>