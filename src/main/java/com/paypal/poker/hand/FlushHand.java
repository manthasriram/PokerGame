package com.paypal.poker.hand;

import java.util.List;

import org.apache.commons.collections4.map.MultiValueMap;

import com.paypal.poker.Card.Card;
import com.paypal.poker.Card.Draw;
import com.paypal.poker.Card.Suite;

/**
 * Poker hand representing flush
 * 
 * @author srmantha
 *
 */
public class FlushHand extends PokerHand {

	public FlushHand() {
		super("FlushHand");
	}

	@Override
	public boolean isMatched(Draw draw) {
		MultiValueMap<Suite, Card> map = new MultiValueMap<Suite, Card>();

		for (Card c : draw.getCards()) {
			map.put(c.getSuite(), c);
		}

		return map.size() == 1;
	}

	@Override
	public List<Card> sortByBestHandDescending(Draw draw) {
		return draw.getCards();
	}

}
