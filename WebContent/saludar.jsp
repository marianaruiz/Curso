<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hola Mundo</title>
</head>
<body>
    <%
        int n;
        String nr=request.getParameter("n");
	    if(nr!=null && nr.matches("\\d+")){
	        n=Integer.valueOf(nr);
	    }
	    else{
	        n=1;
	    }
	    for (int i=0;i<n;i++){
    %>
	    <%if(request.getParameter("nombre")!=null){ %>
	        HOLA <%= request.getParameter("nombre") %>
	    <%} else{ %>
	        HOLA MUNDO
	    <%} %>
        </br>
    <%} %>
</body>
</html>