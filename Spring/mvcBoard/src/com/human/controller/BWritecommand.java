package com.human.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.command.BCommand;
import com.human.dao.BDao;

public class BWritecommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//테이블에 데이터 넣기
		String bName= request.getParameter("bName");
		String bTitle= request.getParameter("bTitle");
		String bContent= request.getParameter("bContent");
		
		BDao dao=new BDao();
		dao.write(bName,bTitle,bContent);

	}

}
