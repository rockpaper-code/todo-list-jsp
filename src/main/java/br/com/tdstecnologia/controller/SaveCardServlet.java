package br.com.tdstecnologia.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tdstecnologia.domain.Card;
import br.com.tdstecnologia.factory.TodoListFactory;

public class SaveCardServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		String titulo =req.getParameter("titulo");	
		String descricao =req.getParameter("descricao");
		
		Card card = new Card(titulo, descricao); 
		TodoListFactory.addCard(card);
		
		resp.sendRedirect( req.getContextPath() );
	}
}
