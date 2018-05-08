package gof.design.patterns.behavioral.memento;

public class ConstraintSolverMemento {
	// private constraint solver state
	private final String state;

	public ConstraintSolverMemento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

}
