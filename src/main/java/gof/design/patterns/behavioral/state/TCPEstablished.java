package gof.design.patterns.behavioral.state;

public class TCPEstablished extends TCPState {
	private static TCPState instance;

	private TCPEstablished() {

	}

	public static TCPState getInstance() {
		if (instance == null) {
			instance = new TCPEstablished();
		}
		return instance;
	}

	@Override
	public void transmit(TCPConnection connection, TCPOctetStream octetStream) {
		connection.processOctet(octetStream);
	}

	@Override
	public void close(TCPConnection connection) {
		// send FIN, receive ACK of FIN
		System.out.println("send FIN, receive ACK of FIN");
		changeState(connection, TCPListen.getInstance());
	}

}
