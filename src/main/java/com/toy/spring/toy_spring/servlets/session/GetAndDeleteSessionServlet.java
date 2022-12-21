package com.toy.spring.toy_spring.servlets.session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/getAndDeleteSession")
public class GetAndDeleteSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        PrintWriter pw = response.getWriter();
        pw.println("<div>Get And Delete Session</div>");

        // Get Session

        // HttpSession httpSession = request.getSession();
        // httpSession.setAttribute("username", username);
        // httpSession.setAttribute("password", password);

        HttpSession httpSession = request.getSession();
        String name = (String) httpSession.getAttribute("username");
        String pass = (String) httpSession.getAttribute("password");

        pw.println("<div>" + name + "</div>");
        pw.println("<div>" + pass + "</div>");

        pw.close();

    }

}