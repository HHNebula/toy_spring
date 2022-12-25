package com.toy.spring.toy_spring.servlets.login;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

// /createSessionJSP?username=SOO&password=5525
@WebServlet(urlPatterns = "/createSessionJSP")
public class CreateSessionJSPServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String path;
        HttpSession httpSession = null;

        if (username.equals("SOO") && password.equals("5525")) {
            // login
            httpSession = request.getSession(false);
            if (httpSession == null) {
                httpSession = request.getSession();
                httpSession.setAttribute("username", username);
                httpSession.setAttribute("password", password);
            }
            path = "/session/checkLogin.jsp";
        } else {
            // logout
            httpSession = request.getSession(false);
            if (httpSession != null) {
                // 설정된 세션을 사라지게 한다.
                httpSession.invalidate();
            }
            path = "/session/checkLogout.jsp";
        }

        RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }

}
