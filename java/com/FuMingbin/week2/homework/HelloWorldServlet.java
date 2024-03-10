package com.FuMingbin.week2.homework;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer=response.getWriter();
        writer.println("Name:FuMingbin" +"\n"+
                "ID:2022211001000305" +"\n"+
                "Data and Time Fri March 8 15:22:34 CST 2024 ");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
