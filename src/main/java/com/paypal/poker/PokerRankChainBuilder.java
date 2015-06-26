package com.paypal.poker;

import com.paypal.poker.hand.FlushHand;
import com.paypal.poker.hand.PokerHand;
import com.paypal.poker.hand.StraightHand;
import com.paypal.poker.hand.ThreePairHand;
import com.paypal.poker.hand.TwoPairHand;

/**
 * chain of the {@link PokerHand} sequenced in descending order of priority
 * 
 * @author srmantha
 *
 */
public class PokerRankChainBuilder {

	public PokerHand buildChain() {

		FlushHand flushHand = new FlushHand();
		StraightHand straightHand = new StraightHand();
		ThreePairHand threePairHand = new ThreePairHand();
		TwoPairHand twoPairHand = new TwoPairHand();

		// Build chain in descending order
		flushHand.setNextHand(straightHand);
		straightHand.setNextHand(threePairHand);
		threePairHand.setNextHand(twoPairHand);

		return threePairHand;
	}
}
