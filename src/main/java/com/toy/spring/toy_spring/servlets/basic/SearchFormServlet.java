package com.toy.spring.toy_spring.servlets.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/serchFormServlet")
public class SearchFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // UTF-8 인코딩 설정(한글 깨짐 방지)
        // 네트워크를 타기 이전에 설정해서 보내줘야함
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();
        DataInfo datasInfor = new DataInfo();
        HashMap<String, String> searchFormData = datasInfor.getSearchFormData();
        String title = searchFormData.get("search_key");

        printWriter.println("<html lang='en'>");
        printWriter.println("<head>");
        printWriter.println("<title>" + title + "</title>");
        printWriter.println(
                "<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css' rel='stylesheet'");
        printWriter.println(
                "integrity='sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT' crossorigin='anonymous'>");
        printWriter.println("<link rel='stylesheet' href='./css/common.css' />");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<form action=''>");
        printWriter.println("<div class='container'>");
        printWriter.println("<div class='fs-3'>Search Form</div>");
        printWriter.println("<div>");
        printWriter.println("<label for='' class='form-label'>Search with name</label>");
        printWriter.println("<input type='text' class='form-control' placeholder='Input Name'>");
        printWriter.println("</div>");
        printWriter.println("</div>");
        printWriter.println("</form>");
        printWriter.println("<script src='https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js'");
        printWriter.println(
                "integrity='sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3' crossorigin='anonymous'>");
        printWriter.println("</script>");
        printWriter.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js'");
        printWriter.println(
                "integrity='sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz' crossorigin='anonymous'>");
        printWriter.println("</script>");
        printWriter.println("</body>");
        printWriter.println("</html>");

        printWriter.close();

    }

}
