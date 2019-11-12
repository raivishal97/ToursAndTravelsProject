package com.training.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.daos.TripDetailsDao;
import com.training.entity.TripDetails;
import com.training.utils.DBConnections;

public class TripServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Connection con;
    public TripServlet() {
        super();
        con = DBConnections.getOracleConnection();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code = request.getParameter("code");
		String tripName = request.getParameter("tripName");
		LocalDate startDate = LocalDate.parse(request.getParameter("startDate"));
		LocalDate endDate = LocalDate.parse(request.getParameter("endDate"));
		long price = Long.parseLong(request.getParameter("price"));
		
		
		TripDetails trip = new TripDetails(code, tripName, startDate, endDate, price);
		System.out.println(trip);
		TripDetailsDao dao = new TripDetailsDao(con);
		
		try {
			dao.add(trip);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
