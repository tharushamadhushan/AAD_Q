package com.example.aad_q;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "customer", urlPatterns = "/customer")
public class Customer extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getHeader("FName");
        String lastName = req.getHeader("LName");
        System.out.println("Hello Mr. "+firstName+" "+lastName+"!");
        var age = req.getParameter("age");
        System.out.println("Your age is : "+age);
    }
}
