package com.design.patterns.behavioural.templatemethod;

public class MensScoringAlgorithm extends ScoringAlgorithm {
	@Override
	public int calculateBaseScore(int hits) {
		return hits * 100;
	}

	@Override
	public int calculateReduction(int seconds) {
		return seconds * 5;
	}

	@Override
	public int calculateOverallScore(int score, int reduction) {
		return score - reduction;
	}
}
