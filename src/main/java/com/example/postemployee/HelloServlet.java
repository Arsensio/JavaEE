package com.example.postemployee;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {


        String a =  request.getParameter("name");
        String b =request.getParameter("possiotion");

        PrintWriter writer =    response.getWriter();
        writer.write("Name = "+a +" & "+ " Possition = "+b);

        System.out.println("name = "+a+" possition = "+b);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String a =  req.getParameter("name");
        String b =req.getParameter("possiotion");

        PrintWriter writer =    resp.getWriter();
        writer.write("Name = "+a +" & "+ " Possition = "+b);


        System.out.println("name = "+a+" possition = "+b);
    }

    public void destroy() {
    }
}