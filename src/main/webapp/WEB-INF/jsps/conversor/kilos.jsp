<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="conversor.negocio.ConversorUnidadesUtils" %> 
<%@ page import="java.math.BigDecimal" %>     
<%@ page import="java.io.IOException" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>De kilos a libras</title>
</head>
<body>
 <%
 
     
 BigDecimal unidadOrigen = null;
 //BigDecimal unidadDestino = null;
 String unidadOrigen1 = request.getParameter("unidadOrigen1");
 if(unidadOrigen1=="" || unidadOrigen1==null){
     unidadOrigen1="1";
 }
 try {
     unidadOrigen = new  BigDecimal(unidadOrigen1);
 } catch (NumberFormatException nfe) {
    unidadOrigen = BigDecimal.ONE;
    nfe.printStackTrace();
 }
 
 BigDecimal unidadDestino = ConversorUnidadesUtils.convertirKg2Lb(unidadOrigen);
 
 %>
<h2>Convertir Kilos a Libras</h2>
<form method="POST">
       <table border="0">
        <tr><td><label for="unidadOrigen">Kilogramos /Kg</label></td>
       <td><input type="number" name="unidadOrigen1" value=<%=unidadOrigen%> step="0.01" /></td></tr>
        <tr><td><label for="unidadDestino">Libras /Lb</label></td>
        <td><input type="number" name="unidadDestino" value=<%=unidadDestino%> /></td></tr>
       
        <tr><td colspan="2" align="center"><input type="Submit" value="Convertir" /></td></tr>
        </table>
        </form>
        <a href="/ejercicio7.1/index.html">Regresar</a>
 
</body>
</html>