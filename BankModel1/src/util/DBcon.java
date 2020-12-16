package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBcon {

	private DBcon() {} 
	private static Connection dbCon = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	
	public static Connection getInstance() {
		if(dbCon == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url ="jdbc:oracle:thin:@localhost:1521:xe", id = "human", pw = "human";
				
				dbCon = DriverManager.getConnection(url, id, pw);
				//System.out.println("-- connected --");
				
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return dbCon;
	}
	public static int statementUpdate(String sql) {
		int resultValue = 0;
			try {
				if(st == null) {
					st = dbCon.createStatement();
				}	
				resultValue = st.executeUpdate(sql);
				//System.out.println("-- 업데이트 --");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		return resultValue;
	}
	
	public static ResultSet statementQuery(String sql) {
			try {
				if(st == null) {
					st = dbCon.createStatement();
				}
				rs = st.executeQuery(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		return rs;
	}
	
	public static void dbClose() {
			try {
				if( rs != null ) rs.close();
				if( st != null ) st.close();
				if(dbCon != null) dbCon.close();			
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				rs = null;
				st = null;
				dbCon = null;
			}

	}
}
