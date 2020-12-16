package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.BankDTO;
import util.DBcon;

public class BankDAO {
	public int insertBank(BankDTO dto) {
		int returnValue=0;
		DBcon.getInstance();
		String sql="insert into bank values(%d,'%s',%d)";
		sql=String.format(sql, dto.getBankID(),dto.getBankName(),dto.getAccID());
		DBcon.statementUpdate(sql);
		sql="commit";
		DBcon.statementUpdate(sql);
		DBcon.dbClose();
		return returnValue;
	}
	
	public int updateBname(String bankName,String rename) {
		int returnValue=0;
		DBcon.getInstance();
		String sql="update bank set name'"+rename+"' where name='"+bankName+"'";
		DBcon.statementUpdate(sql);
		sql="commit";
		DBcon.statementUpdate(sql);
		DBcon.dbClose();
		return returnValue;
	}
	
	public int deleteBank(String bankName) {
		int returnValue=0;
		DBcon.getInstance();
		String sql="delete from bank where name='"+bankName+"'";
		DBcon.statementUpdate(sql);
		sql="commit";
		DBcon.statementUpdate(sql);
		DBcon.dbClose();
		return returnValue;
	}
	public int resetBankTable() {
		int returnValue=0;
		DBcon.getInstance();
		String sql="drop table bank;";
		DBcon.statementUpdate(sql);
		sql="create table bank("
				+ "bankID number(10),"
				+ "bankName varchar2(50),"
				+ "accID number(10))";
		DBcon.statementUpdate(sql);
		sql="commit";
		DBcon.statementUpdate(sql);
		DBcon.dbClose();
		return returnValue;
	}
	public ArrayList<BankDTO> select(){
		ArrayList<BankDTO> arr=new ArrayList<BankDTO>();
		ResultSet rs;
		DBcon.getInstance();
		String sql="select * from bank";
		rs=DBcon.statementQuery(sql);
		try {
			while (rs.next()) {
				arr.add(new BankDTO(
						rs.getLong(1),
						rs.getString(2),
						rs.getLong(3)
						));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBcon.dbClose();
		return arr;
	}
	
}
