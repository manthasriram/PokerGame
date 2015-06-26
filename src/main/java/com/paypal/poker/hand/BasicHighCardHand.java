package com.paypal.poker.hand;

import java.util.Collections;
import java.util.List;

import com.paypal.poker.Card.Card;
import com.paypal.poker.Card.Card.CardComparator;
import com.paypal.poker.Card.Draw;

public class BasicHighCardHand extends PokerHand {

	public BasicHighCardHand() {
		super("BasicHighCardHand");
	}

	@Override
	public boolean isMatched(Draw draw) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<Card> sortByBestHandDescending(Draw draw) {
		Collections.sort(draw.getCards(), new CardComparator());
		return draw.getCards();
	}

}
