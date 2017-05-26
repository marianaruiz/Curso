package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.LocaleUtils;
import org.apache.commons.lang.StringUtils;
import org.omg.CORBA.StringHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class IdiomaServlet
 */
@WebServlet("/idioma.html")
public class IdiomaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger=LoggerFactory.getLogger(CotizadorServlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IdiomaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    logger.info("---Idioma---");
		String lenguaje=StringUtils.defaultIfBlank(request.getParameter("lenguaje"), "es_Mx");
		HttpSession session=request.getSession(false);
		session.setAttribute("locale", LocaleUtils.toLocale(lenguaje));
		response.sendRedirect("cotizador.html");
	}

}
