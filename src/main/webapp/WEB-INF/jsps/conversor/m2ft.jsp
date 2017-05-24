<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.math.BigDecimal" %>
<%@ page import="conversor.negocio.ConversorUnidadesUtils" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Metros a FT JSP</title>
</head>
<body>

    <%! String unidadOrigen = ""; %>
    <%! String unidadDestino = ""; %>
    
    <% 
    
    if (request.getMethod().equals("POST")) {
        
        BigDecimal bdUnidadOrigen = null;
        if (request.getParameter("unidadOrigen") != null 
                && request.getParameter("unidadOrigen").matches("\\d+|\\d+\\.\\d+")) {
            bdUnidadOrigen   = new BigDecimal(request.getParameter("unidadOrigen"));        
        } else {
            bdUnidadOrigen = BigDecimal.ONE;
        }
        
        BigDecimal bdUnidadDestino = ConversorUnidadesUtils.convertirM2Ft(bdUnidadOrigen);
        
        unidadOrigen = bdUnidadOrigen.toString();
        unidadDestino = bdUnidadDestino.toString();
    }
    
    %>
    
    

    <h2>Metros a FT JSP</h2>
    <form method="POST">
        <table border="0">
            <tr>
              <td><label for="unidadOrigen">Metros </label></td>
              <td><input type="number" name="unidadOrigen" value="<%= unidadOrigen %>" step="0.01" /></td>
            </tr>
            <tr>
                <td><label for="unidadDestino">FT </label></td>
                <td><input type="number" name="unidadDestino" value="<%= unidadDestino %>" /></td>
            </tr>
            <tr>
              <td colspan="2" align="center"><input type="Submit" value="Convertir" /></td>
            </tr>
        </table>
    </form>
    
    <a href="/ejercicio7.1/index.html">Regresar</a>
    
    <% unidadOrigen = null; %>
    <% unidadDestino = null; %>
        
</body>
</html>