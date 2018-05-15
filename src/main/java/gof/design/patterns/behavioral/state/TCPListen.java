package gof.design.patterns.behavioral.state;

public class TCPListen extends TCPState {
	private static TCPState instance;

	private TCPListen() {

	}

	public static TCPState getInstance() {
		if (instance == null) {
			instance = new TCPListen();
		}
		return instance;
	}

	@Override
	public void send(TCPConnection connection) {
		// send SYN, receive SYN, ACK, etc.
		System.out.println("send SYN, receive SYN, ACK, etc.");
		changeState(connection, TCPEstablished.getInstance());
	}

}
