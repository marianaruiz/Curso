<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="${sessionScope.locale}"/>
<fmt:setBundle basename="etiquetas"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><fmt:message key="main.title"/></title>
</head>
<body>
<h2><fmt:message key="main.title"/></h2>
    <form id="formPrincipal" method="POST" action="cotizador.html">
    <fieldset>
    <legend><fmt:message key="main.legend"/></legend>
    <table>
        <tr>
            <td><fmt:message key="modelo"/></td>
            <td>
                <select name="modelo" onchange="enviarAuto()">
                        <option value="${requestScope.auto.id}"><c:out value="${requestScope.auto.nombre}"></c:out></option>
                </select>    
            </td>
            <td rowspan="5">
                <img alt="img" src="img/${requestScope.auto.imagen}" width="450" height="200" style="margin-left: 100px"/>
            </td>
        </tr>
        <tr>
            <td><fmt:message key="precio"/></td>
            <td><input type="text" value='<fmt:formatNumber value="${requestScope.auto.precio}" type="currency" />'></td>
        </tr>
        <tr>
             <td><fmt:message key="plazo"/></td>
             <td>
             <select>
                <option value="12">12</option>
                <option value="24">24</option>
                <option value="36">36</option>
             </select>
             </td>
        </tr>
        <tr>
            <td><fmt:message key="enganche.porcentaje"/></td>
            <td><input type="number" step="0.1" name="enganche"></td>
        </tr>
        <tr>
            <td><input type="submit" name="btn" value='<fmt:message key="btn.cotizar"/>'/></td>
            <td><input type="submit" name="btn" value='<fmt:message key="btn.limpiar"/>'/></td>
        </tr>
    </table>
    </fieldset>
    </form>
</body>
</html>