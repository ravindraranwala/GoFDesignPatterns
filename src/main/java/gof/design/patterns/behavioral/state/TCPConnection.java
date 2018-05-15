package gof.design.patterns.behavioral.state;

public class TCPConnection {
	private TCPState state;

	public TCPConnection() {
		super();
		this.state = TCPClosed.getInstance();
	}

	void changeState(TCPState s) {
		this.state = s;
	}

	public void activeOpen() {
		this.state.activeOpen(this);
	}

	public void passiveOpen() {
		this.state.passiveOpen(this);
	}

	public void close() {
		this.state.close(this);
	}

	public void acknowledge() {
		this.state.acknowledge(this);
	}

	public void synchronize() {
		this.state.synchronize(this);
	}

	public void send() {
		this.state.send(this);
	}

	public void processOctet(TCPOctetStream o) {
		System.out.println("Processing TCPOctetStream.");
	}
}
