package com.human.ex;

import java.util.ArrayList;
import java.util.Date;

import com.human.dao.HumanDAO;
import com.human.dto.HumanDTO;

public class HumanMan {

	public static void main(String[] args) {
		
		HumanDAO dao=new HumanDAO();
		dao.insert(new HumanDTO("홍",177.7,30,new Date()));
		dao.update("홍", "길동");
		dao.delete("홍길동");
		ArrayList<HumanDTO> dtos=dao.select();
		
		for(HumanDTO dto:dtos) {
			System.out.println(dto);
		}
		
		System.out.println("종료");

	}

}
