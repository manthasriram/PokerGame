package com.paypal.poker;

import com.paypal.poker.hand.BasicHighCardHand;
import com.paypal.poker.hand.PokerHand;

/**
 * Evaluates {@link Player} and gets his Best Hand
 * 
 * @author srmantha
 *
 */
public class PokerHandEvaluator {

	private static final int LOWEST_PRIORITY = 100;
	private PokerRankChainBuilder pokerRankChainBuilder;
	private PokerHand headHand;

	public PokerHandEvaluator() {
		this.pokerRankChainBuilder = new PokerRankChainBuilder();
		headHand = pokerRankChainBuilder.buildChain();
	}

	/**
	 * Evaluate {@link Player}
	 * 
	 * @param player
	 * @return {@link ResultHand}
	 */
	public ResultHand evaluate(Player player) {
		PokerHand pokerHand = headHand;
		int match_sequence = 1;
		while (pokerHand != null) {
			if (pokerHand.isMatched(player.getDraw())) {
				return new ResultHand(match_sequence, pokerHand,
						player.getDraw());
			} else {
				pokerHand = pokerHand.getNextHand();
				match_sequence++;
			}
		}
		return new ResultHand(LOWEST_PRIORITY, new BasicHighCardHand(),
				player.getDraw());
	}

}
