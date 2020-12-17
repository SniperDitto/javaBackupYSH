package com.human.controller;

import java.util.Date;

import com.human.dao.HumanDAO;
import com.human.dto.HumanDTO;
import com.human.util.DBinput;

public class humanInsert implements HumanExecute {

	@Override
	public void execute(Request request, Response response) {
		inputView(request, response);
		businessLogic(request, response);
		outputView(request, response);

	}

	@Override
	public void inputView(Request request, Response response) {
		System.out.println("human의 데이터 입력");
		System.out.print("이름 입력 : ");
		String name = DBinput.inputString();
		System.out.print("키 입력 : ");
		double height = DBinput.inputDouble();
		System.out.print("나이 입력 : ");
		int age = DBinput.inputInt();
		System.out.print("생일 ");
		Date bday = DBinput.inputDate();

		HumanDTO dto = new HumanDTO(name, height, age, bday);
		request.setAttribute("dto", dto);
	}

	@Override
	public void businessLogic(Request request, Response response) {
		HumanDAO dao=new HumanDAO();
		int result = dao.insert((HumanDTO) request.getAttribute("dto"));
		response.setParameter("result", result+"");
	}

	@Override
	public void outputView(Request request, Response response) {
		System.out.println(response.getParameter("result") + "개의 값 추가");

	}

}
