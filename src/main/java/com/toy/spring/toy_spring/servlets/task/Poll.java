package com.toy.spring.toy_spring.servlets.task;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import com.toy.spring.toy_spring.beans.PollData;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Poll List Servlet
@WebServlet(urlPatterns = "/PollListServlet")
public class Poll extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("user");
        String belong = request.getParameter("belong");
        String title = "Poll List Servlet";
        PrintWriter pw = response.getWriter();

        PollData data = new PollData();

        String[] questionIds = data.getQuestionIds();
        HashMap<String, String> questions = data.getQuestion();
        HashMap<String, String> answers = data.getAnswer();
        ArrayList<String> possibleAnswer;

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
        pw.println("<div class='fs-5 my-3'>Name : " + name + "</div>");
        pw.println("<div class='fs-5 my-3'>Belong : " + belong + "</div>");
        for (int i = 0; i < questionIds.length; i++) {
            pw.println("<div class='my-3'>");
            // "Q1", "Q2", "Q3", "Q4", "Q5" - ID에 맞는 질문 Text 꺼내기
            String value = questions.get(questionIds[i]);
            pw.println("<div>" + (i + 1) + ". " + value + "</div>");

            // ID에 맞는 답변 가능한 항목 Answer ID 갖고오기
            possibleAnswer = data.getPossibleAnswer(questionIds[i]);

            pw.println("<div>");
            // Answer ID를 Text화
            for (int j = 0; j < possibleAnswer.size(); j++) {
                String answerText = answers.get(possibleAnswer.get(j));
                pw.println((j + 1) + ". " + answerText + " ");
            }
            pw.println("</div>");
        }
        pw.println("</div>");
        pw.println(
                "<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js'></script>");
        pw.println("</body>");
        pw.println("</html>");
        pw.close();
    }

}