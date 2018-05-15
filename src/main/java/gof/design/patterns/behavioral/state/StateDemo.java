package gof.design.patterns.behavioral.state;

public class StateDemo {

	public static void main(String[] args) {
		final TCPConnection connection = new TCPConnection();
		connection.passiveOpen();
		connection.send();
		connection.close();
	}

}
