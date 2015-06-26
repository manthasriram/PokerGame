package com.paypal.poker.Card;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.map.MultiValueMap;

/**
 * Draw in the players hand
 * 
 * @author srmantha
 *
 */
public class Draw {

	List<Card> cards = new ArrayList<Card>(5);

	public Draw(List<Card> cards) {
		this.cards = cards;
	}

	public List<Card> getCards() {

		return cards;
	}

	public MultiValueMap<Literal, Card> getCardsAsMap() {
		MultiValueMap<Literal, Card> map = new MultiValueMap<Literal, Card>();

		for (Card c : this.cards) {
			map.put(c.getLiteral(), c);
		}
		return map;
	}

	@Override
	public String toString() {
		return "Draw [cards=" + cards + "]";
	}

}
