<%@ page import="conversor.negocio.ConversorUnidadesUtils"%>
<%@ page import="java.math.BigDecimal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%!private static final StringBuilder html = new StringBuilder();%>
<%!private BigDecimal unidadOrigen = null;%>
<%!private BigDecimal unidadDestino = null;%>
<%!static {
        html.append("<html>");
        html.append("<head><title>Kilometros to Millas</title></head>");
        html.append("<body>");
        html.append("<h2>Kilometros a Millas JSP</h2>");
        html.append("<form method=\"POST\">");
        html.append("<table border=\"0\">");
        html.append("<tr><td><label for=\"unidadOrigen\">Kilometros</label></td>");
        html.append("<td><input type=\"number\" name=\"unidadOrigen\" value=\"%s\" step=\"0.01\"/></td></tr>");
        html.append("<tr><td><label for=\"unidadDestino\">Millas</label></td>");
        html.append("<td><input type=\"number\" name=\"unidadDestino\" value=\"%s\" /></td></tr>");
        html.append("<tr><td colspan=\"2\" align=\"center\"><input type=\"Submit\" value=\"Convertir\" /></td></tr>");
        html.append("</table>");
        html.append("</form>");
        html.append("<a href=\"/ejercicio7.1/index.html\">Regresar</a>");
        html.append("</body>");
        html.append("</html>");
    }%>
<%
    if (request.getMethod().equals("POST")) {
%>
<%
    try {
            unidadOrigen = (request.getParameter("unidadOrigen") != null)
                    ? new BigDecimal(request.getParameter("unidadOrigen")) : new BigDecimal("0");
        } catch (NumberFormatException nfe) {
            unidadOrigen = BigDecimal.ONE;
            nfe.printStackTrace();
        }
        unidadDestino = ConversorUnidadesUtils.convertirKm2Mi(unidadOrigen);
%>

<%=String.format(html.toString(), unidadOrigen, unidadDestino)%>

<%
    } else {
%>
<%=html%>
<%
    }
%>






