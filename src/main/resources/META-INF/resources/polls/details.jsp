<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.HashMap, java.util.ArrayList" %>
    <%
        HashMap<String, Object> question = (HashMap<String, Object>) request.getAttribute("questions");
        ArrayList<HashMap> answer = (ArrayList<HashMap>) request.getAttribute("answers");
        ArrayList<String> possibleAnswer = (ArrayList<String>) request.getAttribute("possibleAnswers");
    %>

</html>

<!DOCTYPE html>
<html lang='en'>

<head>
    <meta charset='UTF-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css'>
    <title>Poll List Servlet JSP</title>
</head>

<body>
    <div class="container">
        <div class="fs-2">
            Poll List Servlet JSP
        </div>
        <hr>
        <div>
            <a href="/PollListServlet/JSP?Qid=Q1" class="btn btn-primary">Q1</a>
            <a href="/PollListServlet/JSP?Qid=Q2" class="btn btn-primary">Q2</a>
            <a href="/PollListServlet/JSP?Qid=Q3" class="btn btn-primary">Q3</a>
            <a href="/PollListServlet/JSP?Qid=Q4" class="btn btn-primary">Q4</a>
            <a href="/PollListServlet/JSP?Qid=Q5" class="btn btn-primary">Q5</a>
        </div>
        <div class="fs-5 my-3">
            <%=question.get("order")%>. <%=question.get("question")%>
        </div>
        <div class="fs-6 my-3">
            <%
                for(String eId : possibleAnswer) {
                    for(HashMap info : answer) {
                        if(info.get("exampleUid").equals(eId)) {
                        }
                    }
                }
            %>
        </div>
    </div>
    <script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js
    '></script>
</body>

</html>