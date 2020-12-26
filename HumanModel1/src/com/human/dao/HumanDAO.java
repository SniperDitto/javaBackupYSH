package com.human.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.human.dto.HumanDTO;
import com.human.util.DBcon;
import com.human.util.DBinput;

public class HumanDAO {
	public int insert(HumanDTO dto) {
		int returnValue=0;
		DBcon.getInstance();
		String sql="insert into human values('%s', %f, %d, to_date('%s','YYYY-MM-DD HH24:MI:SS'))";
		sql=String.format(sql, dto.getName(),dto.getHeight(),dto.getAge(),DBinput.dateToString(dto.getBirthday()));
		System.out.println(sql);
		DBcon.statementUpdate(sql);
		DBcon.dbClose();
		
		return returnValue;
	}
	
	public int update(String name,String rename) {
		int returnValue=0;
		DBcon.getInstance();
		String sql="update human set name='"+rename+"' where name='"+name+"'";
		DBcon.statementUpdate(sql);
		DBcon.dbClose();
		return returnValue;
	}
	
	public int delete(String name) {
		int returnValue=0;
		DBcon.getInstance();
		String sql="delete from human where name='"+name+"'";
		DBcon.statementUpdate(sql);
		DBcon.dbClose();
		return returnValue;
	}
	public ArrayList<HumanDTO> select() {
		ArrayList<HumanDTO> arr=new ArrayList<HumanDTO>();
		ResultSet rs;
		DBcon.getInstance();
		String sql="select * from human";
		rs=DBcon.statementQuery(sql);
		try {
			while (rs.next()) {
				arr.add(new HumanDTO(
						rs.getString(1),
						rs.getDouble(2),
						rs.getInt(3),
						rs.getDate(4)
						));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBcon.dbClose();
		return arr;
	}
}
