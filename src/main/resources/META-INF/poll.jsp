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
    HashMap<String, Object> question = (HashMap<String, Object>) request.getAttribute("question");
%>

        <div>
            <a href="/PollListServlet?Qid=1">Prev</a>
            <a href="/PollListServlet?Qid=2">Prev</a>
            <a href="/PollListServlet?Qid=3">Prev</a>
            <a href="/PollListServlet?Qid=4">Prev</a>
            <a href="/PollListServlet?Qid=5">Next</a>
        </div>
        <div>
            <%= question.get("order")%>. <%= question.get(quesrtion)%>
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