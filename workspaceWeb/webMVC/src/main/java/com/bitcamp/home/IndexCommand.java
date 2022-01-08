package com.bitcamp.home;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexCommand implements CommandService{

	public IndexCommand() {
		
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 홈페이지 서버 작업
		return "index.jsp"; // 뷰파일의 경로와 파일명을 리턴한다.
	}

}
