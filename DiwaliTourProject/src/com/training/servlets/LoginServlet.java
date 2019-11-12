package com.training.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.training.daos.UserDetailsDao;
import com.training.entity.UserDetails;
import com.training.utils.DBConnections;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
    public LoginServlet() {
        super();
        con = DBConnections.getOracleConnection();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long userId = Long.parseLong(request.getParameter("userId"));
		String passWord = request.getParameter("passWord");
		
		UserDetails user = new UserDetails(userId, passWord);
		
		UserDetailsDao dao = new UserDetailsDao(con);
		String type;
		try {
			type = dao.authenticate(user);
			request.getSession(true).setAttribute("type", type);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	RequestDispatcher dispatcher = request.getRequestDispatcher("tourDetails.jsp");
	dispatcher.forward(request, response);
		
		
		
		
	}

}
