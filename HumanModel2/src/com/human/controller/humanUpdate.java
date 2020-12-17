package com.human.controller;

import com.human.dao.HumanDAO;
import com.human.dto.HumanDTO;
import com.human.util.DBinput;

public class humanUpdate implements HumanExecute {

	@Override
	public void execute(Request request, Response response) {
		inputView(request, response);
		businessLogic(request, response);
		outputView(request, response);

	}

	@Override
	public void inputView(Request request, Response response) {
		System.out.print("변경하고 싶은 이름 입력 : ");
		String oldname=DBinput.inputString();
		System.out.print("새로운 이름 입력 : ");
		String newname=DBinput.inputString();
		request.setParameter("name1", oldname);
		request.setParameter("name2", newname);

	}

	@Override
	public void businessLogic(Request request, Response response) {
		HumanDAO dao=new HumanDAO();
		int result = dao.update(request.getParameter("name1"),request.getParameter("name2"));
		response.setParameter("result", result+"");

	}

	@Override
	public void outputView(Request request, Response response) {
		System.out.println(response.getParameter("result") + "개의 값 변경");
		System.out.println(request.getParameter("name1")+" -> "+request.getParameter("name2"));
		
	}

}
