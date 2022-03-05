package com.crud;
import java.sql.*;
import java.util.*;
import java.sql.*;
import com.content.*;
import com.dbconnector.*;
public class EnclosureManager {
public int insert(Enclosure c) throws ClassNotFoundException, SQLException {
	int result=-1;
	
	DBManager dbMgr= new DBManager();
	Connection conn=dbMgr.getConnection();
	String sql="INSERT INTO `gowildwildlife`.`enclosure`\r\n"
			+ "(`type`,\r\n"
			+ "`location`)\r\n"
			+"VALUES\r\n"
			+ "(?,?)";
			
			PreparedStatement pstmt=conn.prepareStatement(sql);
        
			pstmt.setString(1, c.getEnclosureType());
			pstmt.setString(2, c.getEnclosureLocation());
			
			//3.execute statement
			result=pstmt.executeUpdate();
			conn.close();
    return result;
}
public ArrayList<Enclosure>selectAll() throws ClassNotFoundException, SQLException{
	ArrayList<Enclosure> enclosures = new ArrayList<Enclosure>();
	Enclosure E;
	//1.get connection
	DBManager dbMgr = new DBManager();
	Connection conn = dbMgr.getConnection();
	String sql="SELECT `enclosure`.`enclosure_id`,\r\n"
			+ "    `enclosure`.`type`,\r\n"
			+ "    `enclosure`.`location`\r\n"
			+ "FROM `gowildwildlife`.`enclosure`";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while (rs.next())
			{
				E=new Enclosure(rs.getInt("enclosure_id"),
						rs.getString("type"),
						rs.getString("location"));
				enclosures.add(E);
			}
			conn.close();
	return enclosures;
}
public Enclosure getById(int id) throws ClassNotFoundException, SQLException {
	//1.get connection
	Enclosure content= null;
		DBManager dbMgr=new DBManager();//create object or instantiate class 
		Connection conn=dbMgr.getConnection();
		String sql= "SELECT `enclosure`.`enclosure_id`,\r\n"
				+ "    `enclosure`.`type`,\r\n"
				+ "    `enclosure`.`location`\r\n"
				+ "FROM `gowildwildlife`.`enclosure` WHERE `enclosure`.`enclosure_id` = ?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs=pstmt.executeQuery();
		while (rs.next())
		{
			content=new Enclosure(rs.getInt("enclosure_id"),
					rs.getString("type"),
					rs.getString("location"));
		}
		conn.close();
		return content;
}
public int update(Enclosure e) throws ClassNotFoundException, SQLException{
	
	int result=-1;
	
	//1. get connection
	DBManager dbMgr=new DBManager();
	Connection conn=dbMgr.getConnection();
	
	//2.prepare statement
	
	String sql = "UPDATE `gowildwildlife`.`enclosure`\r\n"
			+ "SET\r\n"
			+ "`type` = ?,\r\n"
			+ "`location` = ?\r\n"
			+ "WHERE `enclosure_id` = ?";

	PreparedStatement pstmt=conn.prepareStatement(sql);
	
	// first and second parameters inserted 1. course name and course text
	
	pstmt.setInt(3, e.getEnclosureID());
	pstmt.setString(1, e.getEnclosureType());
	pstmt.setString(2, e.getEnclosureLocation());
	
	
	
	//3.execute statement
	
	result = pstmt.executeUpdate();
	
	return result;
	
}
public int delete (int id) throws SQLException, ClassNotFoundException {
    int rowsDeleted = -1;
    String sql ;
	//1. get Connection
	DBManager dbMgr = new DBManager();
	Connection conn = dbMgr.getConnection();
	
	//2. prepare the statement 
    sql = "DELETE FROM `gowildwildlife`.`enclosure`\r\n"
    		+ "WHERE `enclosure_id` = ?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    //First parameter is the course id of the course entity
    pstmt.setInt(1, id);

    rowsDeleted = pstmt.executeUpdate();
    return rowsDeleted;
}
}

