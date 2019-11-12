package com.training.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.training.entity.TripDetails;
import com.training.entity.UserDetails;
import com.training.utils.DBConnections;

public class UserDetailsDao {
	
private Connection con;
	
	public UserDetailsDao(Connection con) {
		super();
		this.con = DBConnections.getOracleConnection();
	}

	
	public PreparedStatement createStatement(String sql) throws SQLException {
		return  con.prepareCall(sql);
	}
	

	public int add(UserDetails t) throws SQLException{
		String sql = "insert into LOGINDETAILS121297	 values(?,?,?,?,?)";
		PreparedStatement pstmt= createStatement(sql);
		
		pstmt.setString(1, t.getFirstName());
		pstmt.setString(2, t.getLastName());
		pstmt.setLong(3, t.getUserName());
		pstmt.setString(4, t.getPassWord());
		pstmt.setString(5, t.getType());
		return pstmt.executeUpdate();
	}
	
	public String authenticate(UserDetails t) throws SQLException{

		String sql = "select TYPE from logindetails121297 where username='"+t.getUserName()+
				"'and password='"+t.getPassWord()+"'";
		
		PreparedStatement pstmt= createStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		String result = null;
		if(rst.next()) {
			result = rst.getString("TYPE");
		}
		return result;
	}
	
	public int addTripForUser(UserDetails u,TripDetails t) throws SQLException{
		String sql = "insert into REGISTEREDUSERS12121997 values(?,?,?)";
		PreparedStatement pstmt = createStatement(sql);
		pstmt.setLong(1, u.getUserName());
		pstmt.setString(2, t.getTripName());
		pstmt.setLong(3, t.getPrice());
		
		return pstmt.executeUpdate();
	}
	
	
	
	

	
	

}
