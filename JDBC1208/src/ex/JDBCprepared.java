package ex;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

public class JDBCprepared {

	public static void main(String[] args) {	
		//preparedstatement 이용하여 값 만들기
		String sql=null;	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","human","human");
			sql="insert into member values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1,Integer.parseInt(args[0]));
			ps.setString(2, args[1]);
			ps.setString(3, args[2]);
			ps.setString(4, args[3]);
			
			int n=ps.executeUpdate(sql);
			System.out.printf("%d개의 row 변경됨",n);
			
			//preparedstatement null 넣기
			ps.setNull(1,Types.INTEGER);
			ps.setString(2, null);
			ps.setNull(3, Types.VARCHAR);
			ps.setNull(4, Types.VARCHAR);
			ps.executeUpdate();
			
//-----------------------------------------------------------------			
			//java util의 date와 sql의 date는 연동 안됨
			//java.util.Date utilDate = new java.util.Date();
			//java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
			//ps.setDate(1,sqlDate);
			//Timestamp time=new Timestamp(utilDate.getTime());
			//ps.setTimestamp(1,time);
			//Time time2=new Time(utilDate.getTime());
			//ps.setTime(1,time2);
//------------------------------------------------------------------			
			
			
			
			
			if(con!=null)con.close();
			if(ps!=null)ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
