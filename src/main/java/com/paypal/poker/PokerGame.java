package com.paypal.poker;

/**
 * A simple poker game that evaluats 2 poker hands
 * 
 * @author srmantha
 *
 */
public class PokerGame {

	public static void main(String[] args) {

		PokerHandEvaluator pokerHandEvaluator = new PokerHandEvaluator();
		Dealer dealer = new Dealer();

		// Create player one
		Player p1 = new Player();
		p1.setDraw(dealer.deal());

		// Create player 2
		Player p2 = new Player();
		p2.setDraw(dealer.deal());

		// Get the hands
		ResultHand p1ResultHand = pokerHandEvaluator.evaluate(p1);
		System.out.println("Evalated Player hand" + p1ResultHand);

		ResultHand p2ResultHand = pokerHandEvaluator.evaluate(p2);
		System.out.println("Evaluated Player hand" + p2ResultHand);

		// Compare and declare the winner
		if (p1ResultHand.compareTo(p2ResultHand) > 0) {
			System.out.println("Player 1 wins");
		} else {
			System.out.println("Player 2 wins");
		}
	}
}
