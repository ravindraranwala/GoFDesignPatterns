package gof.design.patterns.behavioral.memento;

import gof.design.patterns.structural.adapter.Point;

//Notice this is the Caretaker object.
public class MoveCommand implements Command {
	private final Graphic target;
	private final Point delta;
	private ConstraintSolverMemento state;

	public MoveCommand(Graphic target, Point delta) {
		super();
		this.target = target;
		this.delta = delta;
	}

	@Override
	public void execute() {
		final ConstraintSolver solver = ConstraintSolver.getInstance();
		this.state = solver.createMemento();
		target.move(this.delta);
		solver.solve();
	}

	@Override
	public void unexecute() {
		final ConstraintSolver solver = ConstraintSolver.getInstance();
		// Moves the graphic back.
		target.move(new Point(-this.delta.getX(), -this.delta.getY()));
		// restore solver state
		solver.setMemento(this.state);
		solver.solve();
	}

}
