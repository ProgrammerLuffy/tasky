package com.servlets;
import jakarta.servlet.ServletException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.UserService;
import com.service.UserServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletException;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String un = request.getParameter("username");
		String psw = request.getParameter("password");
		
		UserService us = new UserServiceImpl();
		
		if(us.loginUser(un, psw)) {
			request.setAttribute("user", un);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		
		else {
			request.setAttribute("error", "user not found");
		request.getRequestDispatcher("login.jsp").forward(request, response);}
	}

}
