package com.training.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.TripDetails;
import com.training.entity.UserDetails;
import com.training.utils.DBConnections;

public class TripDetailsDao {

private Connection con;
	
	public TripDetailsDao(Connection con) {
		super();
		this.con = DBConnections.getOracleConnection();
	}

	
	public PreparedStatement createStatement(String sql) throws SQLException {
		return  con.prepareCall(sql);
	}
	
	public int add(TripDetails t) throws SQLException{
		String sql = "insert into TRIPDETAILS121297	 values(?,?,?,?,?)";
		PreparedStatement pstmt= createStatement(sql);
		
		pstmt.setString(1, t.getCode());
		pstmt.setString(2, t.getTripName());
		pstmt.setDate(3, Date.valueOf(t.getStartDate()));
		pstmt.setDate(4, Date.valueOf(t.getEndDate()));
		pstmt.setLong(5, t.getPrice());
		
		return pstmt.executeUpdate();
	}
	
	
	public List<TripDetails> viewAllTrips() throws SQLException{
		String sql="select * from registeredusers121297";
		PreparedStatement pstmt = createStatement(sql);
		
		List<TripDetails> allTrips = new ArrayList<TripDetails>(); 
		ResultSet rst = pstmt.executeQuery();
		
		while(rst.next()) {
			
		}
		
		return allTrips;
	}
	
	
}