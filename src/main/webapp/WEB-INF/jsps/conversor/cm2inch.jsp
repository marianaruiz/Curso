<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.io.IOException"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="conversor.negocio.ConversorUnidadesUtils"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head><title>Conversion de Centimetros a Pulgadas</title></head>
<body>
<%
    StringBuilder html = new StringBuilder();
    
    html.append("<h2>Conversion a Pulgadas</h2>");
    html.append("<form method=\"POST\">");
    html.append("<table border=\"0\">");
    html.append("<tr><td><label for=\"unidadOrigen\">Centimetros</label></td>");
    html.append("<td><input type=\"number\" name=\"unidadOrigen\" value=\"%s\" step=\"0.01\"/></td></tr>");
    html.append("<tr><td><label for=\"unidadDestino\">Pulgadas</label></td>");
    html.append("<td><input type=\"number\" name=\"unidadDestino\" value=\"%s\" step=\"0.01\"/></td></tr>");
    html.append("<tr><td colspan=\"2\" align=\"center\"><input type=\"Submit\" value=\"Convertir\" /></td></tr>");
    html.append("</table>");
    html.append("</form>");
    html.append("<a href=\"/ejercicio7.1/index.html\">Regresar</a>");

    BigDecimal unidadOrigen = null;
        
        try {
            if (request.getParameter("unidadOrigen") != null) {
               unidadOrigen = new BigDecimal(request.getParameter("unidadOrigen"));
            } else {
                unidadOrigen = new BigDecimal("1.0");
            }
        } catch (NumberFormatException nfe) {
            unidadOrigen = BigDecimal.ONE;
            nfe.printStackTrace();
        }
        
        BigDecimal unidadDestino = ConversorUnidadesUtils.convertirCm2Inch(unidadOrigen);
        
        response.getWriter().append(String.format(html.toString(), unidadOrigen, unidadDestino));
   %> 
</body>
</html>