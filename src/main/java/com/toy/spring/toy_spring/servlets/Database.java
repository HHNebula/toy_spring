package com.toy.spring.toy_spring.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.toy.spring.toy_spring.dao.SimpleWithDB;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/simple/WithDBServlets")
public class Database extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html;charset=UTF-8");

        SimpleWithDB simpleWithDB = new SimpleWithDB();
        simpleWithDB.getList();

        PrintWriter pw = response.getWriter();
        pw.println("<div>SimpleWithDBServlets</div>");
        pw.close();

    }

}