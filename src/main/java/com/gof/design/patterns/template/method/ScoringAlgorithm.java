package com.gof.design.patterns.template.method;

public abstract class ScoringAlgorithm {
	public int generateScore(int hits, int seconds) {
		final int score = this.calculateBaseScore(hits);
		final int reduction = this.calculateReduction(seconds);
		return this.calculateOverallScore(score, reduction);
	}

	protected abstract int calculateBaseScore(int hits);

	protected abstract int calculateReduction(int seconds);

	protected abstract int calculateOverallScore(int score, int reduction);
}
