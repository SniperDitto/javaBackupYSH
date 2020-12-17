package com.human.controller;

public interface HumanExecute {
	public void execute(Request request, Response response);
	
	public void inputView(Request request, Response response);
	public void businessLogic(Request request, Response response);
	public void outputView(Request request, Response response);
	
}
