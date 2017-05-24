package lista.controller;

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

import lista.model.Lista;

/**
 * Servlet implementation class tareas
 */
@WebServlet("/listas/lista.html")
public class tareas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Lista> tareas = new ArrayList<Lista>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tareas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        System.out.println("PTM");
        HttpSession sesion=request.getSession(true);
        sesion.setAttribute("lista",tareas);
        request.setAttribute("tarea", "");
//       
//		response.getWriter().append("Served at: ").append(request.getContextPath());
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
