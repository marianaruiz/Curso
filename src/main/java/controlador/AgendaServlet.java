package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.LocaleUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import modelo.Contacto;
import modelo.ContactoDAO;

/**
 * Servlet implementation class AgendaServlet
 */
@WebServlet("/agenda.html")
public class AgendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ContactoDAO contactoDao=new ContactoDAO();  
    private static Logger logger=LoggerFactory.getLogger(AgendaServlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgendaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession(true);
	    logger.info("---GET---");
        if (session.getAttribute("List") == null) {
            session.setAttribute("List", contactoDao.getAll());
        }
        if(session.getAttribute("locale")==null){
            session.setAttribute("locale", LocaleUtils.toLocale("es_MX"));
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsps/Main.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
