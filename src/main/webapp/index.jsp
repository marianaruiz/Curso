<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tareas</title>
<body>
    <h2>Tareas</h2>
    <form method="POST" action="">
        <table border="0">
            <tr><td><label for="unidadOrigen">Centigrados</label></td>
            <td><input type="number" name="unidadOrigen" value="${requestScope.tarea}" step="0.01" /></td></tr>
            <tr><td colspan="2" align="center"><input type="Submit" value="Agregar" /></td></tr>
        </table>
    </form>
    <c:forEach begin="1" end="10" step="1">
         Hola <c:out value="${lista.nombre}"></c:out>
    </c:forEach>
</body>
</html>
