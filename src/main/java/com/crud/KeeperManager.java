package com.crud;
import java.util.*;
import java.sql.*;
import com.content.*;
import com.dbconnector.*;
public class KeeperManager {
public int insert(Keeper c) throws ClassNotFoundException, SQLException {
	int result=-1;
	
	DBManager dbMgr= new DBManager();
	Connection conn=dbMgr.getConnection();
	String sql="INSERT INTO `gowildwildlife`.`keepers`\r\n"
			+ "(`name`,\r\n"
			+ "`date_ of_ birth`,\r\n"
			+ "`email`,\r\n"
			+ "`phone`,\r\n"
			+ "`rank`)\r\n"
			+ "VALUES\r\n"
			+ "(?,?,?,?,?)";
			
			PreparedStatement pstmt=conn.prepareStatement(sql);
        
			pstmt.setString(1, c.getKeeperName());
			pstmt.setString(2, c.getKeeperDOB());
			pstmt.setString(3, c.getKeeperEmail());
			pstmt.setString(4, c.getKeeperPhone());
			pstmt.setString(5, c.getKeeperType());
			//3.execute statement
			result=pstmt.executeUpdate();
			conn.close();
    return result;
}
public ArrayList<Keeper>selectAll() throws ClassNotFoundException, SQLException{
	ArrayList<Keeper> keepers = new ArrayList<Keeper>();
	Keeper E;
	//1.get connection
	DBManager dbMgr = new DBManager();
	Connection conn = dbMgr.getConnection();
	String sql="SELECT `keepers`.`keepers_id`,\r\n"
			+ "    `keepers`.`name`,\r\n"
			+ "    `keepers`.`date_ of_ birth`,\r\n"
			+ "    `keepers`.`email`,\r\n"
			+ "    `keepers`.`phone`,\r\n"
			+ "    `keepers`.`rank`\r\n"
			+ "FROM `gowildwildlife`.`keepers`;";
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while (rs.next())
			{
				E=new Keeper(rs.getInt("keepers_id"),
						rs.getString("name"),
						rs.getString("date_ of_ birth"),
				        rs.getString("email"),
				        rs.getString("phone"),
				        rs.getString("rank"));
				keepers.add(E);
			}
			conn.close();
	return keepers;
}
public Keeper getById(int id) throws ClassNotFoundException, SQLException {
	//1.get connection
	Keeper content= null;
		DBManager dbMgr=new DBManager();//create object or instantiate class 
		Connection conn=dbMgr.getConnection();
		String sql= "SELECT `keepers`.`keepers_id`,`keepers`.`name`,`keepers`.`date_ of_ birth`,`keepers`.`email`,`keepers`.`phone`,`keepers`.`rank`\r\n"
				+ "FROM `gowildwildlife`.`keepers`WHERE `keepers`.`keepers_id`=?;";
				
				
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs=pstmt.executeQuery();
		while (rs.next())
		{
			content=new Keeper(rs.getInt("keepers_id"),
					rs.getString("name"),
					rs.getString("date_ of_ birth"),
			        rs.getString("email"),
			        rs.getString("phone"),
			        rs.getString("rank"));
		}
		conn.close();
		return content;
}
public int update(Keeper k) throws ClassNotFoundException, SQLException{
	
	int result=-1;
	
	//1. get connection
	DBManager dbMgr=new DBManager();
	Connection con=dbMgr.getConnection();
	
	//2.prepare statement
	
	String sql = "UPDATE `gowildwildlife`.`keepers`\r\n"
			+ "SET\r\n"
			+ "`name` = ?,\r\n"
			+ "`date_ of_ birth` = ?,\r\n"
			+ "`email` = ?,\r\n"
			+ "`phone` = ?,\r\n"
			+ "`rank` = ?\r\n"
			+ "WHERE `keepers_id` = ?;";
	

	PreparedStatement pstmt=con.prepareStatement(sql);
	
	// first and second parameters inserted 1. course name and course text
	
	pstmt.setInt   (6, k.getKeeperID());
	pstmt.setString(1, k.getKeeperName());
	pstmt.setString(2, k.getKeeperDOB());
	pstmt.setString(3, k.getKeeperEmail());
	pstmt.setString(4, k.getKeeperPhone());
	pstmt.setString(5, k. getKeeperType());

	
	
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
    sql = "DELETE FROM `gowildwildlife`.`keepers`\r\n"
    		+ "WHERE keepers_id=?;\r\n";
    
    PreparedStatement pstmt = conn.prepareStatement(sql);
    //First parameter is the course id of the course entity
    pstmt.setInt(1, id);

    rowsDeleted = pstmt.executeUpdate();
    return rowsDeleted;
}
}

