package gof.design.patterns.behavioral.state;

public class TCPClosed extends TCPState {
	private static TCPState instance;

	private TCPClosed() {

	}

	public static TCPState getInstance() {
		if (instance == null) {
			instance = new TCPClosed();
		}
		return instance;
	}

	@Override
	public void activeOpen(TCPConnection connection) {
		// send SYN, receive SYN, ACK, etc.
		System.out.println("send SYN, receive SYN, ACK, etc.");
		changeState(connection, TCPEstablished.getInstance());
	}

	@Override
	public void passiveOpen(TCPConnection connection) {
		changeState(connection, TCPListen.getInstance());
	}

}
