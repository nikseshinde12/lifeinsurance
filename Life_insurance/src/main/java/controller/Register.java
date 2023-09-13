package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet; 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Register_service;

/**
 * Servlet implementation class Register
 */


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Register() {
        super();
     
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		
		out.println(name);
		out.println(address);
		out.println(email);
		
		HttpSession session=request.getSession(true);
		
		try {
			Register_service user=new Register_service();
			user.insert(name, address, email);
			System.out.println("Data Inserted successfully");
			
			
		}catch(Exception e) {
			
		
		System.out.println(e);
		
		
		}
			
		}

		}

