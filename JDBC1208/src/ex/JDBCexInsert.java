package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCexInsert {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료");
			//데이터베이스와 연결
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="human";
			String pw="human";
			//connection 통해 statement 객체 생성
			//클라이언트,서버 데이터 주고 받을 때 statement 사용
			con=DriverManager.getConnection(url,user,pw);
			System.out.println("데이터베이스 접속 완료");
			st = con.createStatement();
			//값 추가
			int n=st.executeUpdate("insert into member values(5555,'01011112222','천안시','홍길동')");//변경된 값의 수
			if(n>=1) {
				System.out.println(n+"개의 값 추가");
				System.out.println("정상적으로 작동");
			}else {
				System.out.println("추가된 값이 없음");
			}
			//값 제거
			n=st.executeUpdate("delete from member where mNo=5555");//변경된 값의 수
			if(n>=1) {
				System.out.println(n+"개의 값 삭제");
				System.out.println("정상적으로 작동");
			}else {
				System.out.println("삭제된 값이 없음");
			}
			//값 변경
			n=st.executeUpdate("update member set mName='철수' where mNo=2222");//변경된 값의 수
			if(n>=1) {
				System.out.println(n+"개의 값 변경");
				System.out.println("정상적으로 작동");
			}else {
				System.out.println("변경된 값이 없음");
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(st!=null)st.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}

}
