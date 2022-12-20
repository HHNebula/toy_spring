package com.toy.spring.toy_spring.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cookies/createCookiesServlet")
public class CreateCookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        // Cookie
        Cookie firstCookie = new Cookie("fristName", "SUNGSOO");
        Cookie secondCookie = new Cookie("secondName", "HA");
        response.addCookie(firstCookie);
        response.addCookie(secondCookie);

        // Display
        PrintWriter pw = response.getWriter();
        pw.println("<div>CreateCookiesServlet</div>");
        pw.close();

    }

}
