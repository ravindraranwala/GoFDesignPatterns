package com.design.patterns.behavioural.templatemethod;

public class TemplateMethodDemo {

	public static void main(String[] args) {
		ScoringAlgorithm scoringAlgorithm;

		System.out.print("Man: ");
		scoringAlgorithm = new MensScoringAlgorithm();
		System.out.println(scoringAlgorithm.generateScore(8, 10));

		System.out.print("Woman: ");
		scoringAlgorithm = new WomensScoringAlgorithm();
		System.out.println(scoringAlgorithm.generateScore(9, 12));

		System.out.print("Child: ");
		scoringAlgorithm = new ChildrensScoringAlgorithm();
		System.out.println(scoringAlgorithm.generateScore(5, 16));
	}

}
