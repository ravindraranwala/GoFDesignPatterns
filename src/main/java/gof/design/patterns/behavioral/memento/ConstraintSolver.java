package gof.design.patterns.behavioral.memento;

public class ConstraintSolver {
	// nontrivial state and operations for enforcing
	// connectivity semantics
	private String state;
	private static ConstraintSolver solver;

	private ConstraintSolver() {
		this.state = "initial";
	}

	public static ConstraintSolver getInstance() {
		if (solver == null) {
			solver = new ConstraintSolver();
		}
		return solver;
	}

	public void addConstraint(Graphic startConnection, Graphic endConnection) {
		System.out.println("Adding a constraint...");
	}

	public void removeConstraint(Graphic startConnection, Graphic endConnection) {
		System.out.println("Removing a constraint...");
	}

	public ConstraintSolverMemento createMemento() {
		return new ConstraintSolverMemento(this.state);
	}

	public void setMemento(ConstraintSolverMemento memento) {
		this.state = memento.getState();
	}

	public void solve() {
		System.out.println("Solving the constraints...");
	}
}
