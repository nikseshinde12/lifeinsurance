package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Employ_service;


public class ViewHR extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ViewHR() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		float totalExperience=Float.parseFloat(request.getParameter("totalExperience"));
		
		//float totalExperience=Float.parseFloat(request.getParameter("totalExperience"));
		
		HttpSession session=request.getSession();
	
		try {
			Employ_service es=new Employ_service(); 
			es.viewHR(totalExperience, totalExperience);
			
		}catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("error");
		}
		
	}

}
