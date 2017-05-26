<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<fmt:setLocale value="${sessionScope.locale}"/>
<fmt:setBundle basename="etiquetas"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agenda</title>
</head>
<body>
    <h2 align="center">Agenda</h2>
    <button aling="left"><a href="nuevocontacto.html">Nuevo Contacto</a></button>
    <div align="center">
        <form>
            <fmt:message key="nombre"/>
            <input type="text" name="nombre" style="width:400px;" />
            <input type="submit" name="btn" value='<fmt:message key="btn.buscar"/>' />
        </form>
    </div>
    <div align="right">
        <form>
            <fmt:message key="ordenarPor"/>
             <select>
                <option value="1" key="ordenar"><fmt:message key="nombre.as"/></option>
                <option value="2" key="ordenar"><fmt:message key="nombre.des"/></option>
                <option value="3" key="ordenar"><fmt:message key="fecha.as"/></option>
                <option value="3" key="ordenar"><fmt:message key="fecha.des"/></option>
             </select>
             
            <input type="submit" name="btn" value='<fmt:message key="btn.buscar"/>' /> 
        </form>
    </div>
    
    <form method="POST"  id="form_buscar"action="/todo.html">        
        <c:if test="${not empty sessionScope.List}">
            <table border=1>
        <thead>
            <tr>
                <th><fmt:message key="id"/></th>
                <th><fmt:message key="nombre"/></th>
                <th><fmt:message key="fechaNacimiento"/></th>
                <th><fmt:message key="telCasa"/></th>
                <th><fmt:message key="telTrabajo"/></th>
                <th><fmt:message key="celular"/></th>
                <th><fmt:message key="email"/></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="a" items="${sessionScope.List}">
                <tr>
                    <td>${a.id}</td>
                    <td>${a.nombre}</td>
                    <td><fmt:formatDate  value="${a.fechaNan}" type="date" pattern="dd/MM/yyyy" /></td>
                    <td> ${a.telefonoCasa}</td>
                    <td> ${a.telefonoTrabajo}</td>
                    <td> ${a.celular}</td>
                    <td> ${a.email}</td>
                    <td><input type="submit" name="btn">VER</td>
                </tr>
            </c:forEach>
            <input type="hidden" name="btn" id="btn" value="seleccionar"/>
                <script type="text/javascript">
                       function buscar(){ 
                    	   document.getElementById('btn').value=id;
                           document.getElementById('form_buscar').submit();
                       }
                </script>
        </tbody>
    </table>
        </c:if>
    </form>
    
    
</body>
</html>