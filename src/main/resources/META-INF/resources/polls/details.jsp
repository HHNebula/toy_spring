<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.HashMap" %>

    <!DOCTYPE html>
    <html lang='en'>

    <head>
        <meta charset='UTF-8'>
        <meta http-equiv='X-UA-Compatible' content='IE=edge'>
        <meta name='viewport' content='width=device-width, initial-scale=1.0'>
        <link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css'>
        <title>Spring Servlet</title>
    </head>

    <body>

<% 
    HashMap<String, Object> question = (HashMap<String, Object>) request.getAttribute("questions");
%>

        <div>
            <a href="/PollListServlet/JSP?Qid=Q1">q1</a>
            <a href="/PollListServlet/JSP?Qid=Q2">q2</a>
            <a href="/PollListServlet/JSP?Qid=Q3">q3</a>
            <a href="/PollListServlet/JSP?Qid=Q4">q4</a>
            <a href="/PollListServlet/JSP?Qid=Q5">q5</a>
        </div>
        <div>
            <%= question.get("order")%>. <%= question.get("quesrtion")%>
        </div>
        <div>
            answer1
            answer2
            answer3
            answer4
        </div>
        <script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js
    '></script>
    </body>

    </html>