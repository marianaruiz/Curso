package controlador;


import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.LocaleUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import modelo.Amortizacion;
import modelo.Automovil;
import modelo.AutomovilDAO;
import modelo.CondicionesDeCredito;
import modelo.TablaAmortizacion;
import negocio.Amortizador;

/**
 * Servlet implementation class CotizadorServlet
 */
@WebServlet("/cotizador.html")
public class CotizadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private AutomovilDAO automovilDao= new AutomovilDAO();
    private RequestDispatcher dispacher;
    private static Logger logger=LoggerFactory.getLogger(CotizadorServlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CotizadorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    logger.info("---GET---");
		HttpSession session= request.getSession(true);
		if(session.getAttribute("locale")==null){
		    session.setAttribute("locale", LocaleUtils.toLocale("es_MX"));
		}
		List<Automovil> autos=automovilDao.findAll();
		request.setAttribute("autos", autos);
		dispacher= request.getRequestDispatcher("WEB-INF/jsps/CotizadorStep1.jsp");
		dispacher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    logger.info("---POST---");
	    String btn=StringUtils.defaultIfBlank(request.getParameter("btn"), StringUtils.EMPTY);
	    if(btn.equals("seleccionar")){
	        logger.info("---seleccionar---");
	        int id=NumberUtils.toInt(request.getParameter("modelo"),1);
	        Automovil auto=automovilDao.getbyIde(id);
	        request.setAttribute("auto", auto);
	        dispacher= request.getRequestDispatcher("WEB-INF/jsps/CotizadorStep2.jsp");
	        dispacher.forward(request, response);
	    }
	    else if(btn.equals("Limpiar")|| btn.equals("Clean")){
	        logger.info("--Limpiar---");
	        doGet(request, response);
	    }
	    else if(btn.equals("Cotizar")|| btn.equals("Simulate")){
	        doCotizar(request,response);
	    }
	}

    private void doCotizar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        logger.info("---Cotizar---");
        int id=NumberUtils.toInt(request.getParameter("modelo"),1);
        Automovil auto=automovilDao.getbyIde(id);
        String strEnganche=StringUtils.defaultIfBlank(request.getParameter("enganche"),"1");
        BigDecimal porcentanjeencganche=new BigDecimal(strEnganche);
        Integer plazo=NumberUtils.toInt(request.getParameter("plazo"),12);
        Date fechaInicio=DateUtils.setDays(new Date(), 1);
        fechaInicio=DateUtils.addMonths(fechaInicio, 1);
        BigDecimal enganche=new BigDecimal("0.01").multiply(porcentanjeencganche);
        BigDecimal importeAuto=auto.getPrecio();
        BigDecimal importeEnganche=importeAuto.multiply(enganche);
        BigDecimal importeCredito=importeAuto.subtract(importeEnganche);
        BigDecimal tasainteres=auto.getIntereses().get(plazo);
        CondicionesDeCredito cc = new CondicionesDeCredito(fechaInicio,plazo,importeCredito,importeEnganche,tasainteres);
        TablaAmortizacion ta = Amortizador.calcular(cc);
        request.setAttribute("auto", auto);
        request.setAttribute("ta", ta);
        request.setAttribute("porcentanjeEmganche", porcentanjeencganche);
        dispacher= request.getRequestDispatcher("WEB-INF/jsps/CotizadorStep3.jsp");
        dispacher.forward(request, response);
    }

}
