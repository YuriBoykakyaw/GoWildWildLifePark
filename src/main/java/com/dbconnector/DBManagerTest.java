package com.dbconnector;
import java.sql.*;
import java.util.*;
import com.crud.*;
import com.content.*;
public class DBManagerTest {
	public static void main(String[]args) {
		//Select
		DBManager dbManager = new DBManager();
		try {
			dbManager.getConnection();
		System.out.println("Connection Successfully");
     	Keeper c= new Keeper(null,null,null,null,null);
		c.setKeeperName("Kyaw Zin Phyo");
		c.setKeeperDOB("2022-2-17");
		c.setKeeperEmail("zinphyokyaw818@gmail.com");
		c.setKeeperPhone("09-964733777");
		c.setKeeperType("Senior");
		KeeperManager cu= new KeeperManager();
		int rowInserted = cu.insert(c);
		if (rowInserted==1) {
			System.out.print("Successfully inserted");
		}
	}
    catch (ClassNotFoundException | SQLException e) {
    	// TODO Auto-generated catch block
    	e.printStackTrace();
    }
	}
}