//package com.tcc.projeto.controller;
//
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//public class FilterController implements Filter {
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//
//        System.out.println("filter controller");
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        if (request.getMethod().equals("GET")){
//            System.out.println("filter controller entrando no if");
//            filterChain.doFilter(servletRequest, servletResponse);
//        }else{
//            System.out.println("Sem Filtro");
//            ((HttpServletResponse) servletResponse).setStatus(500);
//            servletResponse.getOutputStream().write("erro no spring".getBytes());
//        }
//
//    }
//}
