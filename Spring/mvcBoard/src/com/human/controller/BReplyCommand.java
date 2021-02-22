package com.human.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.command.BCommand;
import com.human.dao.BDao;
import com.human.dto.BDto;

public class BReplyCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bId= request.getParameter("bId");
		String bName= request.getParameter("bName");
		String bTitle= request.getParameter("bTitle");
		String bContent= request.getParameter("bContent");
		String bGroup= request.getParameter("bGroup");
		String bStep= request.getParameter("bStep");
		String bIndent= request.getParameter("bIndent");
		
		BDao dao=new BDao();
		dao.reply(bId,bName,bTitle,bContent,bGroup,bStep,bIndent);
		
	}

}
