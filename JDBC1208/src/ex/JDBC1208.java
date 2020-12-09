package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1208 {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료");
			//데이터베이스와 연결
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="human";
			String pw="human";
			
			con=DriverManager.getConnection(url,user,pw);
			System.out.println("데이터베이스 접속 완료");
			
			st = con.createStatement();
			rs = st.executeQuery("select * from member");
			
			while(rs.next()) {
				int no=rs.getInt(1);
				String name=rs.getString(2);
				String hp=rs.getString("hp");
				String addr=rs.getString(4);
				System.out.println(no+":"+name+":"+hp+":"+addr);
			}
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(st!=null)st.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
	}

}
