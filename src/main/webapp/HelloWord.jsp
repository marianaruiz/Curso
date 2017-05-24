<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
    <c:set var="nombre" value="${not empty param['nombre'] ? param['nombre'] : 'Mundo'}"/>
    <c:set var="n" value="${not empty param['n'] ? param['n'] : '1'}"/>
    <c:forEach begin="1" end="${n}" step="1">
         Hola <c:out value="${nombre}"></c:out>
    </c:forEach>
</body>
</html>