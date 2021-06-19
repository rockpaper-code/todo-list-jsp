package br.com.tdstecnologia.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tdstecnologia.domain.Card;

public class TodoListServlet extends HttpServlet {
	

	@Override
	public void init() throws ServletException {
		
		super.init();
		
		System.out.println("Iniciou a Servlet TodoList");
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
		
		Card anotacao = new Card();
		anotacao.setTitulo("Card teste"); 
		anotacao.setDescricao("Descrica��o do card");
		
		req.setAttribute("teste", anotacao);
		
		req
			.getRequestDispatcher("index.jsp")
			.include(req, resp);
	}
	
	  
	
}
