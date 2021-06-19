package br.com.tdstecnologia.factory;

import java.util.ArrayList;
import java.util.List;

import br.com.tdstecnologia.domain.Card;

public class TodoListFactory {

	private static List<Card> cards = new ArrayList();
	
	
	public static  void addCard(Card card) {
		cards.add(card);
	}
	
	public static List<Card> getCards() {
		return cards;
	}
}
