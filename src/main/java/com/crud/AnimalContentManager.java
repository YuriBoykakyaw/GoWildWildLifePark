package com.crud;
import java.sql.Connection;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.content.Animal;
import com.dbconnector.DBManager;

public class AnimalContentManager {
	public int insert(Animal c) throws ClassNotFoundException, SQLException {
		int result=-1;
		
		DBManager dbMgr= new DBManager();
		Connection conn=dbMgr.getConnection();
		String sql="INSERT INTO `gowildwildlife`.`animal`\r\n"
				        + "(`name`,\r\n"
						+"`gender`,\r\n"
						+"`year`,\r\n"
						+"`S_ID`,\r\n"
						+"`K_ID`,\r\n"
						+"`E_ID`,\r\n"
						+"`D_ID`)\r\n"
                        + "VALUES\r\n"
                        + "(?,?,?,?,?,?,?)";


				
				PreparedStatement pstmt=conn.prepareStatement(sql);
	        
				pstmt.setString(1, c.getName());
				pstmt.setString(2, c.getGender());
				pstmt.setInt(3, c.getYear());
				pstmt.setInt(4, c.getS_ID());
				pstmt.setInt(5, c.getK_ID());
				pstmt.setInt(6, c.getE_ID());
				pstmt.setInt(7, c.getD_ID());
				
				
				//3.execute statement
				result=pstmt.executeUpdate();
				conn.close();
	    return result;
	}
	public ArrayList<Animal> selectAllAnimalsByKeeperName() throws ClassNotFoundException, SQLException{
		ArrayList<Animal> AnimalList = new ArrayList<Animal>();
		Animal animal;
		//1. get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		//2. prepare statement
		String sql ="SELECT animal.Animal_id,animal.name,animal.gender,animal.year,keepers.keepers_id,keepers.name\r\n"
				+ "FROM animal left join keepers on animal.K_ID=keepers.keepers_id;";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//populate the array list from the record of the table_html
		while (rs.next()) {
			 animal = new Animal(rs.getInt("animal_id"),
					rs.getString("name"),
					rs.getString("gender"),
					rs.getInt("year"),
					rs.getInt("keepers_id"),
					rs.getString("name"));
			AnimalList.add(animal);//add entity object into collection
		}
		conn.close();
		return AnimalList;
	}
	public ArrayList<Animal> selectTotalAnimalCount() throws ClassNotFoundException, SQLException{
		ArrayList<Animal> AnimalList = new ArrayList<Animal>();
		Animal animal;
		//1. get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		//2. prepare statement
		String sql ="select keepers.name, count(animal.Animal_id) as totalanimal"
				+ " from animal left join keepers on animal.K_ID=keepers.keepers_id "
				+ "group by keepers_id ;";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//populate the array list from the record of the table_html
		while (rs.next()) {
			 animal = new Animal(rs.getString("name"),
					rs.getInt("totalanimal"));
			AnimalList.add(animal);//add entity object into collection
		}
		conn.close();
		return AnimalList;
	}
	public ArrayList<Animal> selectAllAnimals() throws ClassNotFoundException, SQLException{
		ArrayList<Animal> AnimalList = new ArrayList<Animal>();
		Animal animal;
		//1. get connection
		DBManager dbMgr = new DBManager();
		Connection conn = dbMgr.getConnection();
		//2. prepare statement
		String sql ="SELECT `animal`.`Animal_id`,\r\n"
				+ "    `animal`.`name`,\r\n"
				+ "    `animal`.`gender`,\r\n"
				+ "    `animal`.`year`,\r\n"
				+ "    `animal`.`S_ID`,\r\n"
				+ "    `animal`.`K_ID`,\r\n"
				+ "    `animal`.`E_ID`,\r\n"
				+ "    `animal`.`D_ID`\r\n"
				+ "FROM `gowildwildlife`.`animal`;\r\n";
				
		PreparedStatement pstmt =conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		//populate the array list from the record of the table_html
		while (rs.next()) {
			 animal = new Animal(rs.getInt("Animal_id"),
					 rs.getString("name"),
					 rs.getString("gender"),
					 rs.getInt("year"),
					 rs.getInt("S_ID"),
					 rs.getInt("K_ID"),
					 rs.getInt("E_ID"),
					 rs.getInt("D_ID"));
			AnimalList.add(animal);//add entity object into collection
		}
		conn.close();
		return AnimalList;
	}
	
	}

