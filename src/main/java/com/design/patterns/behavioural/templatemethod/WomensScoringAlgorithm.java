package com.design.patterns.behavioural.templatemethod;

public class WomensScoringAlgorithm extends ScoringAlgorithm {

	@Override
	public int calculateBaseScore(int hits) {
		return hits * 100;
	}

	@Override
	public int calculateReduction(int seconds) {
		return 4 * seconds;
	}

	@Override
	public int calculateOverallScore(int score, int reduction) {
		return score - reduction;
	}
}
