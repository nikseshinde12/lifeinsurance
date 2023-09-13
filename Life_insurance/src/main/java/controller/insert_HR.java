package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Employ_service;

/**
 * Servlet implementation class insert_HR
 */
public class insert_HR extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insert_HR() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String empname =request.getParameter("empname").trim();
		float totalExperience=Float.parseFloat(request.getParameter("totalExperience"));
		String skills=request.getParameter("skills").trim();
		float pac_kage=Float.parseFloat(request.getParameter("pac_kage"));
		
		System.out.println(empname);
		System.out.println(totalExperience);
		System.out.println(skills);
		System.out.println(pac_kage);

		
		HttpSession session=request.getSession(true);
		
		try {
	
			Employ_service rs=new Employ_service();
             rs.insertHR(empname, totalExperience, skills, pac_kage);
			
			
			
		
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}

		
	}


