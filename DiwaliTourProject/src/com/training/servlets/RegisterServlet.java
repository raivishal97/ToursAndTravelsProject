package com.training.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.daos.UserDetailsDao;
import com.training.entity.UserDetails;
import com.training.utils.DBConnections;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Connection con;
    public RegisterServlet() {
        super();
        con = DBConnections.getOracleConnection();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		long userId = Long.parseLong(request.getParameter("userName"));
		String passWord = request.getParameter("passWord");
		String options = request.getParameter("options");
		
		
		UserDetails user = new UserDetails(firstName, lastName, userId, passWord, options);
		System.out.println(user);
		UserDetailsDao userDao = new UserDetailsDao(con);
		
		try {
			userDao.add(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
