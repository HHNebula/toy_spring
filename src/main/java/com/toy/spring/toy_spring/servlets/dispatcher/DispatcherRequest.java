package com.toy.spring.toy_spring.servlets.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dispatcherRequest")
public class DispatcherRequest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String hiddenParam = request.getParameter("hidden");

        if ("hidden".equals(hiddenParam)) {
            // 해당 서블렛으로 이동
            response.sendRedirect("/simple/WithDBServlets");
        } else if ("/cookies/createCookiesServlet".equals(hiddenParam)) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/cookies/createCookiesServlet");
            requestDispatcher.forward(request, response);
        } else {
            PrintWriter pw = response.getWriter();
            String title = "DispatcherRequest";
            String mesage = "DispatcherServlets with Message!";
            pw.println("<!DOCTYPE html>");
            pw.println("<html lang='en'>");
            pw.println("<head>");
            pw.println(
                    "<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css'>");
            pw.println("<title>" + title + "</title>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<div class='container'>");
            pw.println("<div class='fs-1 my-3'>" + title + "</div>");
            pw.println("<div>SimpleWithDBServlets</div>");
            pw.println("<div>" + mesage + "</div>");
            pw.println("</div>");
            pw.println(
                    "<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js'></script>");
            pw.println("</body>");
            pw.println("</html>");
            pw.close();
        }
    }
}
