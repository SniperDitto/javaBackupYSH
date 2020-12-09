package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JDBCsingle {
	static Scanner sc = new Scanner(System.in);
	private static Connection dbConn=null;
	private static Statement st=null;
	private static ResultSet rs=null;
	
	private JDBCsingle() {}
	public static Connection getInstance() {
		if(dbConn==null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("드라이버 로딩 완료");
				
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				String user="human";
				String pw="human";
				
				dbConn=DriverManager.getConnection(url,user,pw);
				
				
				
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dbConn;
	}
	
	public static int statementUpdate(String sql) {
		int returnValue=0;
		JDBCsingle.getInstance();
		try {
			if(st==null) {
				st=dbConn.createStatement();
			}
			returnValue=st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {

		}
		return returnValue;
	}
	
	public static ResultSet statementQuery(String sql) {
		try {
			if(st!=null) st = dbConn.createStatement();
			rs=st.executeQuery(sql);

		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
		return rs;
	}
	
	public static void printData(ResultSet rs) {
		try {
			while(rs.next()) {
				int no=rs.getInt(1);
				String name=rs.getString(2);
				String hp=rs.getString("hp");
				String addr=rs.getString(4);
				System.out.println(no+":"+name+":"+hp+":"+addr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static int inputInt() {
		int num=0;
		System.out.print("정수 입력  : ");
		try {
			num = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}finally {
			
		}
		return num;
	}
	
	public static Double inputDouble() {
		Double num=null;
		System.out.print("실수 입력  : ");
		try {
			num = Double.parseDouble(sc.nextLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return num;
	}

	public static String inputString() {
		String str=null;
		System.out.print("문자열 입력  : ");
		str = sc.nextLine();
		return str;
	}
	
	public static Date inputDate() {
		Date d=null;
		System.out.println("날짜 입력(yyyy-MM-dd hh:mm:ss : ");
		SimpleDateFormat transFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String input = sc.nextLine();
		try {
			d=transFormat.parse(input);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
	
	public static String dateToString(Date d) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return df.format(d);
	}
	
	public static void dbClose() {
		try {
			if(rs!=null)rs.close();
			if(st!=null)st.close();
			if(dbConn!=null)dbConn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			rs=null;
			st=null;
			dbConn=null;
		}
	}
	
	
	
	
}
