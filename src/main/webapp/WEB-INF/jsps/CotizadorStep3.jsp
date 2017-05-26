<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="${sessionScope.locale }"/>
<fmt:setBundle basename="etiquetas"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><fmt:message key="main.title"/></title>x|
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
                <option value="${requestScope.ta.condiciones.plazo}"><c:out value="${requestScope.ta.condiciones.plazo}"></c:out></option>
             </select>
             </td>
        </tr>
        <tr>
            <td><fmt:message key="enganche.porcentaje"/></td>
            <td><input type="number" step="0.1" name="enganche" value='<fmt:formatNumber value="${requestScope.porcentanjeEmganche}"/>' type="percent"/></td>
        </tr>
        
    </table>
    </fieldset>
    </form>
    </br>
    <table border=1>
        <thead>
            <tr>
                <th><fmt:message key="ta.amortizacion"/></th>
                <th><fmt:message key="ta.fecha"/></th>
                <th><fmt:message key="ta.pagoCapital"/></th>
                <th><fmt:message key="ta.pagoInteres"/></th>
                <th><fmt:message key="ta.acumulado"/></th>
                <th><fmt:message key="ta.remanente"/></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="a" items="${requestScope.ta.amortizaciones}">
                <tr>
                    <td>${a.numero}</td>
                    <td><fmt:formatDate value="${a.fecha}" type="date" pattern="dd/MM/yyyy"/></td>
                    <td><fmt:formatNumber value="${a.pagoCapital}" type="currency" /></td>
                    <td><fmt:formatNumber value="${a.pagoInteres}" type="currency" /></td>
                    <td><fmt:formatNumber value="${a.pagoAcumulado}" type="currency"/></td>
                    <td><fmt:formatNumber value="${a.remanente}" type="currency" /></td>
                </tr>
            </c:forEach>
            
        </tbody>
    </table>
</body>
</html>