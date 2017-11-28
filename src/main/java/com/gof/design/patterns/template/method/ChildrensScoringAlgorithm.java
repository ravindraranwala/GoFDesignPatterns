package com.gof.design.patterns.template.method;

public class ChildrensScoringAlgorithm extends ScoringAlgorithm {

	@Override
	public int calculateBaseScore(int hits) {
		return hits * 200;
	}

	@Override
	public int calculateReduction(int seconds) {
		return seconds * 2;
	}

	@Override
	public int calculateOverallScore(int score, int reduction) {
		if (score > reduction) {
			return score - reduction;
		}
		return 0;
	}

}
