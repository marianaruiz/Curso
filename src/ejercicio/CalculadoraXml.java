package ejercicio;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculadoraXml extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraXml() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	       String a=request.getParameter("a");
	        String b=request.getParameter("b");
	        String op=request.getParameter("op");
	        int n1,n2;
	        System.out.println("a"+a);
	        System.out.println("b"+b);
	        StringBuilder cadena= new StringBuilder();
	        cadena.append("<?xml version=\"1.0\"?>");
	        cadena.append("<respuesta>");
	        if((a!=null && a.matches("\\d+")) &&(b!=null && b.matches("\\d+"))){
	            n1=Integer.valueOf(a);
	            n2=Integer.valueOf(b);
	            if(op.equals("sumar")){
	                cadena.append(String.format("<operador>a%d</operador>",n1));
	                cadena.append(String.format("<operando>a%d</operando>",n2));
	                cadena.append("<operacion>Suma</operacion>");
	                cadena.append(String.format("<resultado>%d</resultado>",n1+n2));
	            }
	            else if(op.equals("restar")){
	                cadena.append(String.format("<operador>a%d</operador>",n1));
	                cadena.append(String.format("<operando>a%d</operando>",n2));
	                cadena.append("<operacion>Resta</operacion>");
	                cadena.append(String.format("<resultado>%d</resultado>",n1-n2));
	                
	            }
	            else if(op.equals("multiplicar")){
	                cadena.append(String.format("<operador>a%d</operador>",n1));
	                cadena.append(String.format("<operando>a%d</operando>",n2));
	                cadena.append("<operacion>Multiplicacion</operacion>");
	                cadena.append(String.format("<resultado>%d</resultado>",n1*n2));
	               
	            }
	            else if(op.equals("dividir")){
	                cadena.append("<h1>Suma</h1>");
	                if(n2!=0){
	                    cadena.append(String.format("<operador>a %d</operador>",n1));
	                    cadena.append(String.format("<operando>b %d</operando>",n2));
	                    cadena.append("<operacion>Divicion</operacion>");
	                    cadena.append(String.format("<resultado>%d</resultado>",n1/n2));
	                }
	                else{
	                    cadena.append("<error>NO se puede realizar la divición b=0</error>");
	                }
	            }
	            else{
	                cadena.append("<error>NO existe la operacion especificada</error>");
	              
	            }
	        }
	        else{
	            cadena.append("<error>No es posible realizar la operación introduce un dato</error>");
	        }
	        
	        cadena.append("</respuesta>");
	
        response.setHeader("Content-Type","application/xml;charset=ISO-8859-1" );
        response.getWriter().append(cadena);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
