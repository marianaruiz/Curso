package controlador;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import modelo.Contacto;
import modelo.ContactoDAO;
import modelo.FormateadorUtil;

/**
 * Servlet implementation class NuevoContacto
 */
@WebServlet("/nuevocontacto.html")
public class NuevoContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=LoggerFactory.getLogger(NuevoContacto.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NuevoContacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    logger.info("---GET---");
	    RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsps/nuevo.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession(false);
	    String nombre=StringUtils.defaultIfBlank(request.getParameter("nombre"), null);
	    String fecha=StringUtils.defaultIfBlank(request.getParameter("fecha"),null);
	    String telefonoCasa=StringUtils.defaultIfBlank(request.getParameter("telefonoCasa"),null);
	    String telefonoTrabajo=StringUtils.defaultIfBlank(request.getParameter("telefonoTrabajo"),null);
	    String celular=StringUtils.defaultIfBlank(request.getParameter("celular"),null);
	    String email=StringUtils.defaultIfBlank(request.getParameter("email"),null);
	    try {
            Date fechad=FormateadorUtil.parse(fecha);
            ContactoDAO contactoDao= new ContactoDAO();
            int id=contactoDao.getAll().size()+1;
            Contacto c=new Contacto(id,nombre,fechad,telefonoCasa,telefonoTrabajo,celular,email);
            contactoDao.save(c);
            request.setAttribute("contacto",c);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	   
	    RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsps/ver.jsp");
        dispatcher.forward(request, response);
	    
	}

}
