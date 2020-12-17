package com.human.controller;

import java.util.ArrayList;

import com.human.dao.HumanDAO;
import com.human.dto.HumanDTO;

public class humanSelect implements HumanExecute {

	@Override
	public void execute(Request request, Response response) {
		inputView(request, response);
		businessLogic(request, response);
		outputView(request, response);

	}

	@Override
	public void inputView(Request request, Response response) {
		System.out.println("현재 데이터 목록");

	}

	@Override
	public void businessLogic(Request request, Response response) {
		HumanDAO dao=new HumanDAO();
		ArrayList<HumanDTO> dtos=dao.select();
		response.setAttribute("dtos", dtos);

	}

	@Override
	public void outputView(Request request, Response response) {
		ArrayList<HumanDTO> dtos=(ArrayList<HumanDTO>) response.getAttribute("dtos");
		for(HumanDTO Hdto:dtos) {
			System.out.println(Hdto);
		}

	}

}
