package com.human.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.human.command.BCommand;
import com.human.dao.BDao;
import com.human.dto.BDto;

/**
 * Servlet implementation class BFrontController
 */
@WebServlet("*.do")
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//사용자에게 보여줄 view 설정
		String viewPage=null;
		
		//사용자가 요청한 .do URI가져오기
		String uri=request.getRequestURI();
		String conPath=request.getContextPath();
		String com=uri.substring(conPath.length());
		
		BCommand command=null;
		
		System.out.println(uri);
		System.out.println(conPath);
		System.out.println(com);//.do 페이지 정보
		if(com.equals("/list.do")) {
			viewPage="list.jsp";
			command=new BListCommand();
			command.execute(request, response);
			
		}else if(com.equals("/write_view.do")) {
			viewPage="write_view.jsp";
		}else if(com.equals("/write.do")) {
			viewPage="list.do";
			command=new BWritecommand();
			command.execute(request, response);
			
		}else if(com.equals("/content_view.do")) {
			viewPage="content_view.jsp";
			command=new BContentViewCommand();
			command.execute(request, response);
			
			
		}else if(com.equals("/delete.do")) {
			viewPage="list.do";
			command=new BDeleteCommand();
			command.execute(request, response);
			
		}else if(com.equals("/modify.do")) {
			viewPage="list.do";
			command=new BModifyCommand();
			command.execute(request, response);
			
			
		}else if(com.equals("/reply_view.do")) {
			viewPage="reply_view.jsp";
			command=new BReplyViewCommand();
			command.execute(request, response);
			
			
		}else if(com.equals("/reply.do")) {
			viewPage="list.do";
			command=new BReplyCommand();
			command.execute(request, response);
			
		}
		
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
