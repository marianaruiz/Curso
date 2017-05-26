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
<style>
    #opciones form span {
	   cursor: pointer;
    }
     #opciones{
        float: right;
     }
</style>
</head>
<body>
<h2><fmt:message key="main.title"/></h2>
    <div id=opciones>
        <form method="POST" action="idioma.html" id="formLengueje">
            <input type="hidden" name="lenguaje" id="campo_lenguaje"/>
            <span onclick="cambiarLenguaje('es_MX')">
                <img src="img/Mexico-icon.png" width="32" height="32" title="Espa&ntilde;ol"/>
            </span>
            <span onclick="cambiarLenguaje('en_US')">
                <img src="img/USA-icon.png" width="32" height="32" title="English"/>
            </span>
        </form>
        <script type="text/javascript">
               function cambiarLenguaje(lenguaj){
            	   console.log("aqui");
            	   document.getElementById('campo_lenguaje').value=lenguaj;
            	   console.log(document.getElementById('campo_lenguaje').value);
            	   document.getElementById('formLengueje').submit();
               }
        </script>
    </div>
    <form id="formPrincipal" method="POST" action="cotizador.html">
    <fieldset>
    <legend><fmt:message key="main.legend"/></legend>
    <table>
        <tr>
            <td><fmt:message key="modelo"/></td>
            <td>
                <select name="modelo" onchange="enviarAuto()">
                <option value="">--<fmt:message key="modelo"/>--</option>
                <c:forEach var="auto" items="${autos}">
                <option value="${auto.id}"><c:out value="${auto.nombre}"></c:out></option>
                </c:forEach>
                </select>
                <input type="hidden" name="btn" id="btn" value="seleccionar"/>
                <script type="text/javascript">
                       function enviarAuto(){ 
                    	   document.getElementById('formPrincipal').submit();
                       }
                </script>
            </td>
        </tr>
    </table>
    </fieldset>
    </form>
</body>
</html>