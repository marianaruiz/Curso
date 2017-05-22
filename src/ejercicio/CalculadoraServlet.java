package ejercicio;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    // TODO Auto-generated method stub
        String a=request.getParameter("a");
        String b=request.getParameter("b");
        String op=request.getParameter("op");
        int n1,n2;
        System.out.println("a"+a);
        System.out.println("b"+b);
        StringBuilder cadena= new StringBuilder();
        cadena.append("<html>");
        cadena.append("<head></head>");
        cadena.append("<body>");
        if((a!=null && a.matches("\\d+")) &&(b!=null && b.matches("\\d+"))){
            n1=Integer.valueOf(a);
            n2=Integer.valueOf(b);
            if(op.equals("sumar")){
                cadena.append("<h1>Suma</h1>");
                cadena.append(String.format("<h2>%d</h2>",n1+n2));
            }
            else if(op.equals("restar")){
                cadena.append("<h1>Resta</h1>");
                cadena.append(String.format("<h2>%d</h2>",n1-n2));
                
            }
            else if(op.equals("multiplicar")){
                cadena.append("<h1>Multiplicación</h1>");
                cadena.append(String.format("<h2>%d</h2>",n1*n2));
               
            }
            else if(op.equals("dividir")){
                cadena.append("<h1>Suma</h1>");
                if(n2!=0){
                    cadena.append(String.format("<h2>%d</h2>",n1/n2));
                }
                else{
                    cadena.append("NO se puede realizar la divición b=0");
                }
            }
            else{
                cadena.append("NO existe la operacion especificada");
              
            }
        }
        else{
            cadena.append("<h1>No es posible realizar la operación introduce un dato");
        }
        
        cadena.append("</body>");
        cadena.append("</html>");
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
