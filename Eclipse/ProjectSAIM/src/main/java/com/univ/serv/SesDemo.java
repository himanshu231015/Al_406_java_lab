package com.univ.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//how to create session and data extraction form session
@WebServlet("/SesDemo")
public class SesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SesDemo() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession(true); //creating new session it will return the object of http session
		PrintWriter pw = response.getWriter();
		Integer i = (Integer)hs.getAttribute("key"); //get object from session
		if(i==null)
		{
			pw.println("you are visiting 1 time");
			hs.setAttribute("key", 1);  		//put value in session
		}
		else {
			int x=i;
			x+=1;
			pw.println("your are visiting " +x+ " Times");
			hs.setAttribute("key",x);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
