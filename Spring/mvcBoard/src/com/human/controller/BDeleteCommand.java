package com.human.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.command.BCommand;
import com.human.dao.BDao;

public class BDeleteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bId= request.getParameter("bId");
		
		BDao dao=new BDao();
		dao.delete(bId);
		
	}

}
