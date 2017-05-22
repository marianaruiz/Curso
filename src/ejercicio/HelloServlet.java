package ejercicio;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    String name=request.getParameter("name");
	    String nr=request.getParameter("n");
	    int n=0;
	    System.out.println("n"+nr);
	    System.out.println("name"+name);
	    StringBuilder cadena= new StringBuilder();
	    cadena.append("<html>");
	    cadena.append("<head></head>");
	    cadena.append("<body>");
	    if(nr!=null && nr.matches("\\d+")){
	        n=Integer.valueOf(nr);
	    }
	    else{
	        n=1;
	    }
	    for (int i=0;i<n;i++){
    	    cadena.append("<h1>HOLA ");
    	    if(name!=null && name.matches("\\S+")){
    	        cadena.append(name);
    	    }
    	    else{
    	        cadena.append("MUNDO");
    	    }
    	    cadena.append("</br>");
    	    cadena.append("</h1>");
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
