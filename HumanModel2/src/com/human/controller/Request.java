package com.human.controller;

import java.util.HashMap;

//데이터 전송 클래스
public class Request {
	private HashMap<String, Object> hm = new HashMap<String, Object>();
	
	public void setParameter(String key,String value) {
		hm.put(key, value);
	}
	public String getParameter(String key) {
		return (String) hm.get(key);
	}
	
	public void setParameterValues(String key,String[] value) {
		hm.put(key, value);
	}
	public String[] getParameterValues(String key) {
		return (String[]) hm.get(key);
	}
	
	public void setAttribute(String key,Object value) {
		hm.put(key, value);
	}
	public Object getAttribute(String key) {
		return hm.get(key);
	}
	
	
}
