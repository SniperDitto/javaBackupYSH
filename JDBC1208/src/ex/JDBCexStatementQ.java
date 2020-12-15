package ex;

import java.sql.ResultSet;
import util.JDBCsingle;

public class JDBCexStatementQ {

	public static void main(String[] args) {
		JDBCsingle.getInstance();
		String sql=null;
		String select="select * from member";
			
		sql="insert into member values(5555,'01011112222','천안시','홍길동')";
		JDBCsingle.statementUpdate(sql);
		System.out.println("inserted");
		ResultSet rs= JDBCsingle.statementQuery(select);
		JDBCsingle.printData(rs);
		
		sql="delete from member where mNo=5555";
		JDBCsingle.statementUpdate(sql);
		System.out.println("deleted");
		rs= JDBCsingle.statementQuery(select);
		JDBCsingle.printData(rs);
		
		sql="update member set mName='길동' where mNo=2222";
		JDBCsingle.statementUpdate(sql);
		System.out.println("updated");
		rs= JDBCsingle.statementQuery(select);
		JDBCsingle.printData(rs);
		
		System.out.print("검색하려는 멤버의 번호를 입력하세요 : ");
		int inputNO=JDBCsingle.inputInt();
		sql=String.format("select * from member where mNo=%d", inputNO);
		JDBCsingle.statementUpdate(sql);
		rs= JDBCsingle.statementQuery(select);
		JDBCsingle.printData(rs);
		
		System.out.println("데이터 추가하기");
		System.out.print("추가할 멤버 번호 : ");
		int inputmNo=JDBCsingle.inputInt();
		System.out.print("추가할 멤버 전화번호 : ");
		String inputhp=JDBCsingle.inputString();
		System.out.print("추가할 멤버 주소 : ");
		String inputaddr=JDBCsingle.inputString();
		System.out.print("추가할 멤버 이름 : ");
		String inputmName=JDBCsingle.inputString();
		sql="insert into member values(%d,'%s','%s','%s')";
		sql=String.format(sql, inputmNo,inputhp,inputaddr,inputmName);
		JDBCsingle.statementUpdate(sql);
		rs= JDBCsingle.statementQuery(select);
		JDBCsingle.printData(rs);
		
		JDBCsingle.dbClose();

	}

}
