package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Register_service;


public class View_Hql extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public View_Hql() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//int id=Integer.parseInt(request.getParameter("id"));
		String address=request.getParameter("address");
		
		HttpSession session=request.getSession(true);
	try {
	
		Register_service user=new Register_service();
		user.viewhql(address);
		System.out.println("all details show");
		
	}catch(Exception e) {
		System.out.println(e);
	}
		
	}

}
