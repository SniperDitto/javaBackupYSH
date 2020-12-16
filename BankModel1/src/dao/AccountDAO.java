package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.AccountDTO;
import util.DBcon;

public class AccountDAO {
	public int insertAcc(AccountDTO dto) {
		int returnValue=0;
		DBcon.getInstance();
		String sql="insert into account values(%d, '%s', '%s', %d)";
		sql=String.format(sql, dto.getAccID(),dto.getName(),dto.getPw(),dto.getBalance());
		DBcon.statementUpdate(sql);
		sql="commit";
		DBcon.statementUpdate(sql);
		System.out.println("계정 추가됨");
		DBcon.dbClose();
		return returnValue;
	}
	
	public int updateName(Long accID,String newName) {
		int returnValue=0;
		DBcon.getInstance();
		String sql="update account set name='"+newName+"' where accID='"+accID+"'";
		DBcon.statementUpdate(sql);
		sql="commit";
		DBcon.statementUpdate(sql);
		DBcon.dbClose();
		return returnValue;
	}
	
	public int updatePW(Long accID,String newPW) {
		int returnValue=0;
		DBcon.getInstance();
		String sql="update account set pw='"+newPW+"' where accID='"+accID+"'";
		DBcon.statementUpdate(sql);
		sql="commit";
		DBcon.statementUpdate(sql);
		DBcon.dbClose();
		return returnValue;
	}
	public int updateBal(Long accID,int newBal) {
		int returnValue=0;
		DBcon.getInstance();
		String sql="update account set balance='"+newBal+"' where accID='"+accID+"'";
		DBcon.statementUpdate(sql);
		sql="commit";
		DBcon.statementUpdate(sql);
		DBcon.dbClose();
		return returnValue;
	}
	public int deleteAcc(Long accID) {
		int returnValue=0;
		DBcon.getInstance();
		String sql="delete from account where accID='"+accID+"'";
		DBcon.statementUpdate(sql);
		sql="commit";
		DBcon.statementUpdate(sql);
		DBcon.dbClose();
		return returnValue;
	}
	public int resetAccTable() {
		int returnValue=0;
		DBcon.getInstance();
		String sql="drop table account";
		DBcon.statementUpdate(sql);
		sql="create table account(accID number(10), name varchar2(50), pw varchar2(50), balance number(10))";
		DBcon.statementUpdate(sql);
		sql="commit";
		DBcon.statementUpdate(sql);
		DBcon.dbClose();
		return returnValue;
	}
	public ArrayList<AccountDTO> select(){
		ArrayList<AccountDTO> arr=new ArrayList<AccountDTO>();
		ResultSet rs;
		DBcon.getInstance();
		String sql="select * from account";
		rs=DBcon.statementQuery(sql);
		try {
			while (rs.next()) {
				arr.add(new AccountDTO(
						rs.getLong(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4)
						));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBcon.dbClose();
		return arr;
	}
}
