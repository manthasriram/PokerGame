package com.paypal.poker;

import com.paypal.poker.Card.Draw;
import com.paypal.poker.hand.PokerHand;

public class ResultHand implements Comparable<ResultHand> {

	private int priority;
	private PokerHand matchedHand;
	private Draw draw;

	public ResultHand(int priority, PokerHand pokerHand, Draw draw) {
		this.priority = priority;
		this.matchedHand = pokerHand;
		this.draw = draw;
	}

	public int getPriority() {
		return priority;
	}

	public PokerHand getMatchedHand() {
		return matchedHand;
	}

	public int compareTo(ResultHand otherHand) {

		if (this.priority < otherHand.priority) {
			return 1;
		} else if (this.priority > otherHand.priority) {
			return -1;
		} else {
			return matchedHand.compareSimilarhands(draw, otherHand.draw);
		}

	}

	@Override
	public String toString() {
		return "ResultHand [priority=" + priority + ", matchedHand="
				+ matchedHand + ", draw=" + draw + "]";
	}

}
