package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Register_service;

public class Register_update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Register_update() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	int id=Integer.parseInt(request.getParameter("id"));
	String name=request.getParameter("name");
	String address=request.getParameter("address");
	String email=request.getParameter("email");
	
	out.println(name);
	out.println(address);
	out.println(email);
	
	HttpSession session=request.getSession(true);
	
	try {
	Register_service user=new Register_service();
	user.update(id, name, address, email);
	response.sendRedirect("success");
	
	}catch(Exception e) {
		e.printStackTrace();
	}

	}
	}
