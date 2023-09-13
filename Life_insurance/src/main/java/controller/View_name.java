package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Register_service;

/**
 * Servlet implementation class View_name
 */
public class View_name extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public View_name() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String address=request.getParameter("address");
		
		HttpSession session=request.getSession(true);
		
		
		try {
		Register_service userr=new Register_service();
	    userr.view_address(address);
		}catch(Exception e) {
			System.out.println(e);
		}
	

}
}