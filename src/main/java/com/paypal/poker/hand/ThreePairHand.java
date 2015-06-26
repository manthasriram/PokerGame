package com.paypal.poker.hand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.map.MultiValueMap;

import com.paypal.poker.Card.Card;
import com.paypal.poker.Card.Card.CardComparator;
import com.paypal.poker.Card.Draw;
import com.paypal.poker.Card.Literal;

public class ThreePairHand extends PokerHand {

	public ThreePairHand() {
		super("ThreePairHand");
	}

	@Override
	public boolean isMatched(Draw draw) {
		MultiValueMap<Literal, Card> map = draw.getCardsAsMap();
		for (Literal l : map.keySet()) {
			if (map.getCollection(l).size() == 3) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Card> sortByBestHandDescending(Draw draw) {

		MultiValueMap<Literal, Card> map = draw.getCardsAsMap();

		List<Card> threePair = new ArrayList<Card>();
		List<Card> highCards = new ArrayList<Card>();

		for (Literal l : map.keySet()) {
			if (map.getCollection(l).size() == 3) {
				threePair.addAll(map.getCollection(l));
			} else {
				highCards.addAll(map.getCollection(l));
			}
		}
		Collections.sort(highCards, new CardComparator());

		threePair.addAll(highCards);

		return threePair;
	}

}
