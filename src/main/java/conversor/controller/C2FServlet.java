package conversor.controller;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import conversor.negocio.ConversorUnidadesUtils;

/**
 * Servlet implementation class C2FServlet
 */
@WebServlet("/conversor/c2f.html")
public class C2FServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C2FServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsps/conversor/c2f.jsp");
        request.setAttribute("unidadOrigen", "");
        request.setAttribute("unidadDestino", "");
        
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String strUnidadOrigen = StringUtils.defaultIfBlank(request.getParameter("unidadOrigen"), "1");
        BigDecimal unidadOrigen = NumberUtils.createBigDecimal(strUnidadOrigen);
        BigDecimal unidadDestino = ConversorUnidadesUtils.gc2gf(unidadOrigen);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsps/conversor/c2f.jsp");
        request.setAttribute("unidadOrigen", unidadOrigen);
        request.setAttribute("unidadDestino", unidadDestino);
        dispatcher.forward(request, response);
	}

}
