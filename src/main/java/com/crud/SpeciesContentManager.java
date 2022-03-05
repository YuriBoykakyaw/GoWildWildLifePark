package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.content.Species;
import com.dbconnector.DBManager;

public class SpeciesContentManager {
	public int insert(Species c) throws ClassNotFoundException, SQLException {
		int result=-1;
		
		DBManager dbMgr= new DBManager();
		Connection conn=dbMgr.getConnection();
		String sql="INSERT INTO `gowildwildlife`.`species`\r\n"	
				+ "(`type`,\r\n"
				+ "`group`,\r\n"
				+ "`lifestyle`,\r\n"
				+ "`status`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?,?,?)";
				
				PreparedStatement pstmt=conn.prepareStatement(sql);
	        
				pstmt.setString(1, c.getType());
				pstmt.setString(2, c.getGroup());
				pstmt.setString(3, c.getLifestyle());
				pstmt.setString(4, c.getStatus());
				
				//3.execute statement
				result=pstmt.executeUpdate();
				conn.close();
	    return result;
}
	}
