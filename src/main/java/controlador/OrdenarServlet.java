package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.math.NumberUtils;

import modelo.ComparadorFechaNan;
import modelo.ComparadorFechaNanDes;
import modelo.ComparadorPorNombre;
import modelo.ComparadorPorNombreDes;
import modelo.Contacto;
import modelo.ContactoDAO;

/**
 * Servlet implementation class OrdenarServlet
 */
@WebServlet("/OrdenarServlet.html")
public class OrdenarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdenarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    Integer ordenar=NumberUtils.toInt(request.getParameter("ordenar"),1);
	    ContactoDAO contactoDao= new ContactoDAO();
	    HttpSession session = request.getSession(false);
	    List<Contacto>lista = null;
	    switch (ordenar) {
        case 1:
            lista=contactoDao.getAllCom(new ComparadorPorNombre());
            break;
        case 2:
            lista=contactoDao.getAllCom(new ComparadorPorNombreDes());
            break;
        case 3:
            lista=contactoDao.getAllCom(new ComparadorFechaNan());
            break;
        case 4:
            lista=contactoDao.getAllCom(new ComparadorFechaNanDes());
            break;
        default:
            break;
        }
	    session.setAttribute("List", lista);
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsps/Main.jsp");
        dispatcher.forward(request, response);
	}

}
