<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% String a=request.getParameter("a");
	   String b=request.getParameter("b");
	   String op=request.getParameter("op");
	   int n1,n2;
	   if((a!=null && a.matches("\\d+")) &&(b!=null && b.matches("\\d+"))){
           n1=Integer.valueOf(a);
           n2=Integer.valueOf(b);
           if(op.equals("sumar")){%>
               <h1>Suma</h1>
               <h2><%=n1+n2 %></h2>
           <%}
           else if(op.equals("restar")){ %>
               <h1>Resta</h1>"
               <h2><%=n1-n2%></h2>
               
           <%}
           else if(op.equals("multiplicar")){%>
               <h1>Multiplicación</h1>
               <h2><%=n1*n2%></h2>
              
           <%}
           else if(op.equals("dividir")){%>
               <h1>Dividir</h1>
               <%if(n2!=0){%>
                   <h2><%=n1/n2%></h2>
               <%}
               else{%>
                   <h3>"NO se puede realizar la divición b=0"</h3>
               <%}
           }
           else{%>
               <h3>"NO existe la operacion especificada"</h3>
             
            <%}
       }
       else{%>
          <h3>No es posible realizar la operación introduce un dato"</h3>
       <% }%>
</body>
</html>