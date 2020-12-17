package com.human.controller;

import com.human.dao.HumanDAO;
import com.human.dto.HumanDTO;
import com.human.util.DBinput;

public class humanDelete implements HumanExecute {

	@Override
	public void execute(Request request, Response response) {
		inputView(request, response);
		businessLogic(request, response);
		outputView(request, response);

	}

	@Override
	public void inputView(Request request, Response response) {
		System.out.print("삭제하고 싶은 이름 입력 : ");
		String delName=DBinput.inputString();
		request.setParameter("delName", delName);
	}

	@Override
	public void businessLogic(Request request, Response response) {
		HumanDAO dao=new HumanDAO();
		int result = dao.delete(request.getParameter("delName"));
		response.setParameter("result", result+"");

	}

	@Override
	public void outputView(Request request, Response response) {
		System.out.println(request.getParameter("result") + "개의 값 삭제");

	}

}
