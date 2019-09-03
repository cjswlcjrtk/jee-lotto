package com.lotto.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.serviceImpls.ConsumerServiceImpl;
import com.lotto.web.services.ConsumerService;


@WebServlet("/consumer.do")
public class ConsumerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("잘 들어오나?");
		String cid = request.getParameter("cid");
		String pass = request.getParameter("pass");
		ConsumerBean param = new ConsumerBean();
		param.setCid(cid);
		param.setPass(pass);
		System.out.println("테스트" + param.toString());
		ConsumerService service = new ConsumerServiceImpl();
		service.registerConsumer(param);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
