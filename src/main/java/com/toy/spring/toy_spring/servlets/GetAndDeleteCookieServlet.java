package com.toy.spring.toy_spring.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cookies/createCookiesServlet")
public class GetAndDeleteCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        pw.println("<div>SimpleWithDBServlets</div>");

        // Get Cookie
        Cookie cookies[] = request.getCookies();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            String value = cookie.getValue();
            pw.println("<div>" + name + "</div>");
            pw.println("<div>" + value + "</div>");

            // Delete Cookie
            if (name.equals("seondName")) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
        pw.close();
    }

}
