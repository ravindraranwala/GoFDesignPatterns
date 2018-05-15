package gof.design.patterns.behavioral.state;

public class TCPState {
	public void transmit(TCPConnection connection, TCPOctetStream octetStream) {
		System.out.println("Default transmission of data.");
	}

	public void activeOpen(TCPConnection connection) {
		System.out.println("Default ActiveOpen of the connection.");
	}

	public void passiveOpen(TCPConnection connection) {
		System.out.println("Default PassiveOpen of the connection.");
	}

	public void close(TCPConnection connection) {
		System.out.println("Default Closing of the connection.");
	}

	public void synchronize(TCPConnection connection) {
		System.out.println("Default synchronize.");
	}

	public void acknowledge(TCPConnection connection) {
		System.out.println("Default acknowledge.");
	}

	public void send(TCPConnection connection) {
		System.out.println("Default send.");
	}

	protected void changeState(TCPConnection connection, TCPState newState) {
		connection.changeState(newState);
	}
}
