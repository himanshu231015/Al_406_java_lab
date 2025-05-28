package com.univ.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.univ.DAO.customerDAO;
import com.univ.DTO.customerDTO;

/**
 * Servlet implementation class firstServlet
 */
@WebServlet("/firstServlet")  //anotation 
public class firstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public firstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cname = request.getParameter("cname");
		String cadd = request.getParameter("cadd");
		String email = request.getParameter("email");
		String mob = request.getParameter("mob");
		String unm = request.getParameter("unm");
		String pw = request.getParameter("pw");
		customerDTO dto = new customerDTO();
		dto.setCname(cname);
		dto.setCadd(cadd);
		dto.setEmail(email);
		dto.setMob(Long.parseLong(mob));
		dto.setUnm(unm);
		dto.setPw(pw);
		customerDAO dao = new customerDAO();
		int x = dao.insert(dto);
		if(x==1) {
			response.sendRedirect("login.html");
		}
		else{
			response.sendRedirect("first.html");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
