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

@WebServlet("/conversor/lt100km2kmlt.html")
public class Lt100Km2kmLtServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Lt100Km2kmLtServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsps/conversor/lt100km2kmlt.jsp");
	    request.setAttribute("unidadOrigen", "");
	    request.setAttribute("unidadDestino", "");
	    dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String strUnidadOrigen = StringUtils.defaultIfBlank(request.getParameter("unidadOrigen"), "1");
	    BigDecimal unidadOrigen = NumberUtils.createBigDecimal(strUnidadOrigen);
	    BigDecimal unidadDestino = ConversorUnidadesUtils.convertirLt100km2Kmlt(unidadOrigen);
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsps/conversor/lt100km2kmlt.jsp");
        request.setAttribute("unidadOrigen", unidadOrigen);
        request.setAttribute("unidadDestino", unidadDestino);
        dispatcher.forward(request, response);
	}
}
