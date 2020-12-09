package ex;

import java.sql.Connection;
import util.JDBCsingle;

public class JDBCexSingleton {

	public static void main(String[] args) {
		Connection conn=JDBCsingle.getInstance();
		String sql=null;
		sql="insert into member values(5555,'01011112222','천안시','홍길동')";
		JDBCsingle.statementUpdate(sql);
		System.out.println("inserted");
		sql="delete from member where mNo=5555";
		JDBCsingle.statementUpdate(sql);
		System.out.println("deleted");
		sql="update member set mName='철수' where mNo=2222";
		JDBCsingle.statementUpdate(sql);
		System.out.println("updated");
		
		
		JDBCsingle.dbClose();

		

	}

}
