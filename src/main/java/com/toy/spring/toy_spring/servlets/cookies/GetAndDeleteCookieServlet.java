package com.toy.spring.toy_spring.servlets.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/getAndDeleteCookie")
public class GetAndDeleteCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();
        pw.println("<div>Get And Delete Cookie</div>");

        // Get Cookie
        Cookie cookies[] = request.getCookies();
        for (Cookie cookie : cookies) {

            // Cookie firstCookie = new Cookie("fristName", "SUNGSOO");
            // Cookie secondCookie = new Cookie("secondName", "HA");

            String name = cookie.getName(); // fristName / secondName
            String value = cookie.getValue(); // SUNGSOO / HA

            pw.println("<div>" + name + "</div>");
            pw.println("<div>" + value + "</div>");

            // Delete Cookie
            if (name.equals(name)) {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
        pw.close();
    }

}
