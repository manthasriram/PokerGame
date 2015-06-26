package com.paypal.poker.hand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.map.MultiValueMap;

import com.paypal.poker.Card.Card;
import com.paypal.poker.Card.Card.CardComparator;
import com.paypal.poker.Card.Draw;
import com.paypal.poker.Card.Literal;

public class TwoPairHand extends PokerHand {

	public TwoPairHand() {
		super("TwoPairHand");
	}

	@Override
	public boolean isMatched(Draw draw) {
		MultiValueMap<Literal, Card> map = getCardsAsMap(draw);
		for (Literal l : map.keySet()) {
			if (map.getCollection(l).size() == 2) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Card> sortByBestHandDescending(Draw draw) {

		MultiValueMap<Literal, Card> map = getCardsAsMap(draw);

		List<Card> twoPair = new ArrayList<Card>();
		List<Card> highCards = new ArrayList<Card>();

		for (Literal l : map.keySet()) {
			if (map.getCollection(l).size() == 2) {
				twoPair.addAll(map.getCollection(l));
			} else {
				highCards.addAll(map.getCollection(l));
			}
		}
		Collections.sort(highCards, new CardComparator());

		twoPair.addAll(highCards);

		return twoPair;
	}

	private MultiValueMap<Literal, Card> getCardsAsMap(Draw draw) {
		MultiValueMap<Literal, Card> map = new MultiValueMap<Literal, Card>();

		for (Card c : draw.getCards()) {
			map.put(c.getLiteral(), c);
		}
		return map;
	}

}
