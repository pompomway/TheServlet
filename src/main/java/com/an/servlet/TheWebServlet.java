package com.an.servlet;

import java.io.IOException;
//https://medium.com/appxtech/%E6%B7%BA%E8%AB%87request%E4%B8%AD%E7%9A%84attribute-c20c21867987

//https://inf.news/technique/87a0457a4a76ac34d21d4bafa5fbb520.html 一定要看

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WebServlet")
public class TheWebServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet"+req.getAttribute("filter")); //獲取req裡面的屬性filter
		resp.sendRedirect("/hello"); //重新定向
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost"+req.getAttribute("filter"));
	}

}
