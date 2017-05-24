<%@ page import="conversor.negocio.ConversorUnidadesUtils"%>
<%@ page import="java.io.IOException"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>

	<%
		String unidadOrigen = "";
		String unidadDestino = "";
	%>
	<%
	if (request.getMethod().equals("POST")) {
		BigDecimal unidadOrigen2 = null;

		if (request.getParameter("unidadOrigen") != null && request.getParameter("unidadOrigen").matches("\\d+|\\d+\\.\\d+")) {
			unidadOrigen2 = new BigDecimal(request.getParameter("unidadOrigen"));
		} else {
			unidadOrigen2 = BigDecimal.ONE;
		}

		BigDecimal unidadDestino2 = ConversorUnidadesUtils.convertirLt2Gl(unidadOrigen2);

		unidadOrigen = unidadOrigen2.toString();
		unidadDestino = unidadDestino2.toString();
	}
	%>

	<h2>Galones - l</h2>
	<form method="POST">
		<table border="0">
			<tr>
				<td><label for="unidadOrigen">Cantidad en Litros</label></td>
				<td><input type="number" name="unidadOrigen" value="<%=unidadOrigen%>" step="0.01" /></td>
			</tr>
			<tr>
				<td><label for="unidadDestino">Galon</label></td>
				<td><input type="number" name="unidadDestino" value="<%=unidadDestino%>" /></td>
			</tr>
			<tr>
				<td colspan=2 align=center>
					<button type=submit>
						<img src="/ejercicio7.1/images/galones.jpg" width=30 height=25 />
					</button>
				</td>
			</tr>
		</table>
	</form>
	<a href="/ejercicio7.1/index.html">Regresar</a>
	
	<% unidadOrigen = null; %>
	<% unidadDestino = null; %>
	
</body>
</html>