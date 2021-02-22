package com.human.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class upload
 */
@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		String savePath="upload";//서버에 저장할 위치 선정
		int uploadFileSizeLimit=100*1024*1024;//100M
		String encType="UTF-8";
		
		ServletContext context=getServletContext();
		String uploadFilePath=context.getRealPath(savePath);
		System.out.println("실제 서버상 주소 : "+uploadFilePath);
		
		try {
			MultipartRequest multi=new MultipartRequest(
					request,
					uploadFilePath,
					uploadFileSizeLimit,
					encType,
					new DefaultFileRenamePolicy()//파일이름중복시 어떻게할것인지
					);
			//업로드된 파일 이름 얻기
			String fileName= multi.getFilesystemName("uploadFile");
			
			if(fileName==null) {
				System.out.println("파일업로드x");
			}else {
				out.println("<br>작성자 : "+multi.getParameter("name"));
				out.println("<br>제목 : "+multi.getParameter("title"));
				out.println("<br>파일 : "+fileName);
				out.println("<br>파일 : <a href=upload/"+fileName+">"+fileName+"</a>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
