package br.com.tdstecnologia.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tdstecnologia.domain.Card;
import br.com.tdstecnologia.factory.TodoListFactory;

public class TodoListServlet extends HttpServlet {
	

	@Override
	public void init() throws ServletException {
		
		super.init();
		
		System.out.println("Iniciou a Servlet TodoList");
		
		Card anotacao1 = new Card("Card 1", "descricao 1");
		Card anotacao2 = new Card("Card 2", "descricao 2");
		Card anotacao3 = new Card("Card 3", "descricao 3");

		TodoListFactory.addCard(anotacao1);
		TodoListFactory.addCard(anotacao2);
		TodoListFactory.addCard(anotacao3);
    }
	
	@Override
	public void destroy() {
		
		super.destroy();
		
		System.out.println("Finalizou a Servlet TodoList");
	}
	
	
	/*
	  GET
	  POST
	  DELETE
	  PUT
	  PATCH
	*/
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setAttribute("cards", TodoListFactory.getCards());
		
		req
			.getRequestDispatcher("index.jsp")
			.include(req, resp);
	}
	
	  
	
}
