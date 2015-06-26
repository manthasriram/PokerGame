package com.paypal.poker;

import com.paypal.poker.Card.Draw;

public class Player {

	private Draw draw;
	private ResultHand resultHand;

	public Draw getDraw() {
		return draw;
	}

	public void setDraw(Draw draw) {
		this.draw = draw;
	}

	public ResultHand getResultHand() {
		return resultHand;
	}

	public void setResultHand(ResultHand resultHand) {
		this.resultHand = resultHand;
	}
}
