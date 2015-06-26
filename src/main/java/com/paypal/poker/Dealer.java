package com.paypal.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.paypal.poker.Card.Card;
import com.paypal.poker.Card.Card.CardComparator;
import com.paypal.poker.Card.Draw;
import com.paypal.poker.Card.Literal;
import com.paypal.poker.Card.Suite;

public class Dealer {

	int totalCards = 5;
	Random rand = new Random();

	public Draw deal() {

		List<Card> cards = new ArrayList<Card>();

		for (int i = 0; i < 5; i++) {

			Suite s = Suite.values()[rand.nextInt(4)];
			Literal l = Literal.values()[rand.nextInt(13)];

			Card c = new Card(s, l);
			cards.add(c);
		}
		Collections.sort(cards, new CardComparator());

		Draw d = new Draw(cards);

		return d;
	}
}
