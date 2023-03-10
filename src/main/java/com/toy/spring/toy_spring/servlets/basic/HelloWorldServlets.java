package com.toy.spring.toy_spring.servlets.basic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 파일경로를 가리기 위한 별칭 매칭
@WebServlet(urlPatterns = "/helloWorldServlets")
public class HelloWorldServlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // Response에서 PrintWriter를 가져와 내보내기
        PrintWriter printWriter = response.getWriter();
        String message = "HelloWorldServlets! with message";

        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<title>HelloWorldServlets");
        printWriter.println("</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<div>" + message);
        printWriter.println("</div>");
        printWriter.println("</body>");
        printWriter.println("</html>");

        printWriter.close();
        // HTML 구조를 모두 String 형태로 내보내야 함

    }

}