package com.design.patterns.behavioural.visitor;

public interface VisitorBase {
	void visit(Worker worker);

	void visit(Manager manager);
}
