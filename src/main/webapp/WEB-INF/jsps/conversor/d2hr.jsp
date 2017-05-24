<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="conversor.negocio.ConversorUnidadesUtils"%>
<%@ page import="java.math.BigDecimal"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Conversor de D&iacute;as a Horas</title>
</head>
<body>
	<%
	    BigDecimal numeroDias = null;
		BigDecimal unidadDestino =null;
	    String numDias = request.getParameter("numeroDias");//:(request.getParameter("numeroDias"));
	    if(numDias != null && numDias.length()>0){
	        try {
		        numeroDias = new BigDecimal(numDias);
		    } catch (NumberFormatException nfe) {
		        out.print(""+nfe.getMessage());
		        numeroDias = BigDecimal.ONE;
		        nfe.printStackTrace();
		    }
	        unidadDestino = ConversorUnidadesUtils.d2hr(numeroDias);
	    }
	    out.print("<h2>D&iacute;as a horas</h2>");
	    out.print("<form method=\"POST\">");
	    out.print("<table border=\"0\">");
	    out.print("<tr><td><label for=\"numeroDias\">N&uacute;mero de d&iacute;as</label></td>");
	    out.print("<td><input type=\"number\" name=\"numeroDias\" value=\""+(numDias==null ? ("") : (numDias))+"\" step=\"0.01\"/></td></tr>");
	    out.print("<tr><td><label for=\"unidadDestino\">Horas / D&iacute;as</label></td>");
	    out.print("<td><input type=\"number\" name=\"unidadDestino\" value=\""+(unidadDestino==null ? (""):(unidadDestino))+"\" /></td></tr>");
	    out.print("<tr><td colspan=\"2\" align=\"center\"><input type=\"Submit\" value=\"Convertir\" /></td></tr>");
	    out.print("</table>");
	    out.print("</form>");
	    out.print("<a href=\"/ejercicio7.1/index.html\">Regresar</a>");
	    out.print("</body>");
	    out.print("</html>");
	%>
</body>
</html>