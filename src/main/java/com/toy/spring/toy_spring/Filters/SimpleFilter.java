package com.toy.spring.toy_spring.Filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/*") // 모든 웹 클라이언트에서 오는 요청에서 필터 동작
public class SimpleFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println(request.getRemoteHost());
        System.out.println(request.getRemoteAddr());

        // HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        // HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        // String uri = httpServletRequest.getRequestURI();

        // if (uri.endsWith("Servlet")) {
        // httpServletResponse.sendRedirect("/intex.html");
        // }

        chain.doFilter(request, response);

    }

}
