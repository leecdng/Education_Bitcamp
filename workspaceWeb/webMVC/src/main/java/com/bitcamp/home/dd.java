package com.bitcamp.home;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/*.do")
public class dd extends HttpServlet {
   private static final long serialVersionUID = 1L;
    
   HashMap<String, CommandService> hm= new HashMap<String, CommandService>();
   
    public dd() {
        super();
    }
    public void init(ServletConfig config) throws ServletException{
       //urlMapping.properties에 있는 key와 value를 구하여 HasMap에 주소와 객체를 저장한다.
       //web.xml에서 properties파일명 가져오기 
       String propFileName = config.getInitParameter("path");
       System.out.println("propfileName="+ propFileName);
       
       Properties prop = new Properties();
       try {
          //파일에서 문자열을 읽어 Properties객체 저장한다.
          FileInputStream fis = new FileInputStream(propFileName);
          prop.load(fis);
       }catch(Exception e) {
          System.out.println("프로퍼티 객체 입력에러 발생...."+ e.getMessage());
       }
       ///////////////////////////////////////////
       //properties객체의 모든 키를 구한다.
       Enumeration keyList = prop.propertyNames();
       while(keyList.hasMoreElements()) {
          String key = (String)keyList.nextElement();
          String className = prop.getProperty(key);
          
          //key HashMap 키로 사용하고
          //value 객체를 만들어 hashmap 값으로 사용한다.
          try {
              Class commandClass = Class.forName(className);
              CommandService service = (CommandService)commandClass.getDeclaredConstructors()[0].newInstance();
              hm.put(key, service);
          }catch(Exception e) {
             System.out.println("Command 객체 생성 에러 발생");
          }
          
          
          System.out.println("key="+ key+", "+className);
          
       }
    }
    
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request, response);
   }

   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String ctxPath = request.getContextPath(); //  /webMVC
    String uri = request.getRequestURI();   //0123456789
    System.out.println("ctxPath="+ctxPath); // / webMVC/index.do
    System.out.println("uri="+ uri);
          
    //mapping 주소 구하기
    String key = uri.substring(ctxPath.length()); // /index.do
    CommandService command = hm.get(key);
    String viewFileName = command.execute(request, response);
    //view 파일명의 위치로 이동하기
    RequestDispatcher dispactcher = request.getRequestDispatcher(viewFileName);
    dispactcher.forward(request, response);
   }

}