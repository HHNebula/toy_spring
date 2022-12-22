package com.toy.spring.toy_spring.servlets.task;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;

import com.toy.spring.toy_spring.dao.PollWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// /PollListServlet/JSP 주소창에 입력시 동작
@WebServlet(urlPatterns = "/PollListServlet/JSP")
public class PollWithJSP extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        // input
        String qId = request.getParameter("Qid");

        // biz with DB and Class
        PollWithDB pollWithDB = new PollWithDB();
        HashMap<String, Object> questions = null;
        try {
            questions = pollWithDB.getQuestion(qId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // output
        request.setAttribute("questions", questions);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/polls/details");
        requestDispatcher.forward(request, response);

    }

}
