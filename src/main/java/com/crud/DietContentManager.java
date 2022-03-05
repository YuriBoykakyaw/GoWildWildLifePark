package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.content.Diet;
import com.dbconnector.DBManager;

public class DietContentManager {
	public int insert(Diet e) throws ClassNotFoundException, SQLException {
		int result=-1;
		
		DBManager dbMgr= new DBManager();
		Connection conn=dbMgr.getConnection();
		String sql="INSERT INTO `gowildwildlife`.`diet`\r\n"
				+ "(`type`,\r\n"
				+ "`no_of_ feeds`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?)";
				PreparedStatement pstmt=conn.prepareStatement(sql);
	        
				pstmt.setString(1, e.getDietType());
				pstmt.setInt(2, e.getDiet_no_of_feeds());
				
				//3.execute statement
				result=pstmt.executeUpdate();
				conn.close();
	    return result;
	}
}
